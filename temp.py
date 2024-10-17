def select_min(tasks, available): 
     min_val = float('inf') 
     min_idx = -1 
     for i in range(len(tasks)) :
         
          if available[i] and tasks[i] < min_val: 
               min_val = tasks[i] 
               min_idx = i 
     return min_val, min_idx 

def allocate_resources(priority_a, priority_b): 
    n = len(priority_a) 
    available = [True] * n 
    primary_allocation = [] 
    secondary_allocation = [] 
    for i in range(n): 
        min_val_a, min_idx_a = select_min(priority_a, available) 
        min_val_b, min_idx_b = select_min(priority_b, available) 
        print("primary_allocation",primary_allocation)
        print("secondary_allocation",secondary_allocation,"\n")
        if min_val_a <= min_val_b: 
            primary_allocation.append(min_idx_a) 
            available[min_idx_a] = False 
        
        else: 
            secondary_allocation.insert(0, min_idx_b) 
            available[min_idx_b] = False 
            final_allocation = primary_allocation + secondary_allocation 
       
    return final_allocation

#running methods here
priority_a = [4, 9, 3, 8, 7] 
priority_b = [5, 2, 6, 10, 1] 
print(allocate_resources(priority_a, priority_b))