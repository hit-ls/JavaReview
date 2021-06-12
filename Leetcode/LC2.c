/** C resolution
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addOne(struct ListNode* res, struct ListNode* a){
    if(a->val == 10){
        res->val=0;
        if(a->next == NULL){
            res->next=(struct ListNode*)malloc(sizeof(struct ListNode));
            res->next->next=NULL;
            res->next->val=1;
            return res;
        }
        else{
            a->next->val += 1;
            res->next = (struct ListNode*)malloc(sizeof(struct ListNode));
            res->next->next=NULL;
            return addOne(res->next,a->next);
        }
    }
    else if(a->next == NULL){
        res->val = a->val;
        return res;
    }
    else{
        res->val = a->val;
        res->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        res->next->next=NULL;
        return addOne(res->next,a->next);
    }
}
struct ListNode* addTwo(struct ListNode* res, struct ListNode* a, struct ListNode* b, int carry){
    int sum = a->val + b->val + carry;
    res->val = sum % 10;
    carry = sum /10;
    if(a->next==NULL && b->next==NULL){
        if(carry==0)
            res->next=NULL;
        else{
            res->next=(struct ListNode*)malloc(sizeof(struct ListNode));
            res->next->next=NULL;
            res->next->val=1;
        }
        return res;
    }
    else if(a->next == NULL){
        if(carry!=0){
            b->next->val += carry;
        }
        res->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        res->next->next=NULL;
        return addOne(res->next,b->next);
    }
    else if(b->next == NULL){
        if(carry!=0){
            a->next->val += carry;
        }
        res->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        res->next->next=NULL;
        return addOne(res->next,a->next);
    }
    else{
        res->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        res->next->next=NULL;
        return addTwo(res->next,a->next,b->next,carry);
    }
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    if(l1==NULL) return l2;
    if(l2==NULL) return l1;
    struct ListNode* res;
    res = (struct ListNode*)malloc(sizeof(struct ListNode));
    res->next=NULL;
    addTwo(res,l1,l2,0);
    return res;
}
