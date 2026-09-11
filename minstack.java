#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 30000

typedef struct {
    int value;
    int min_val;
} StackPair;

typedef struct {
    StackPair s[MAX_SIZE];
    int top_index;
} MinStack;

MinStack* minStackCreate() {
    MinStack* obj = (MinStack*)malloc(sizeof(MinStack));
    obj->top_index = -1;
    return obj;
}

void minStackPush(MinStack* obj, int val) {
    obj->top_index++;
    
    if (obj->top_index == 0) {
        obj->s[obj->top_index].value = val;
        obj->s[obj->top_index].min_val = val;
    } else {
        int current_min = obj->s[obj->top_index - 1].min_val;
        if (val < current_min) {
            current_min = val;
        }
        obj->s[obj->top_index].value = val;
        obj->s[obj->top_index].min_val = current_min;
    }
}

void minStackPop(MinStack* obj) {
    if (obj->top_index >= 0) {
        obj->top_index--;
    }
}

int minStackTop(MinStack* obj) {
    return obj->s[obj->top_index].value;
}

int minStackGetMin(MinStack* obj) {
    return obj->s[obj->top_index].min_val;
}

void minStackFree(MinStack* obj) {
    free(obj);
}
