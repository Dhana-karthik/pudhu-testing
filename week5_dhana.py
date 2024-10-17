import numpy as np 
A = np.array([2,3,5,7,11,13,17]) 
print(A) 
print(type(A)) 
B = np.arange(4,16,2) 
print(B) 
print(type(B)) 
C = np.zeros(5) 
print(C) 
print(type(C)) 
D = np.ones(7)

'''

print(D) 
print(type(D)) 
E = np.full(3,99) 
print(E) 
print(type(E)) 
F = np.random.randint(1,6,10) 
print(F) 
print(type(F)) 
'''

print(A) 
print(A.dtype) 
print(C) 
print(C.dtype) 

print(bin(5)) 
print(bin(23)) 
print(bin(63)) 
print(bin(64))

print(A) 
print(A[0]) 
index_list = [1,5,0,4] 
print(A[index_list])
print(A[[1,5,0,4]]) 

'''
print(A)
print(A[2:5]) 
G = A[2:5] 
print(G)
G[1] = 888 
print(G)
print(A)

print(A.base) 
print(G.base) 
H = A[2:5].copy() 
print(H) 
print(H.base) '''
'''
print(B) 
print(E) 
J = np.concatenate((B,E)) 
print(J) 
K = np.split(B,2) 
print(K)
'''