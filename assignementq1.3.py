import numpy as np
import matplotlib.pyplot as plt
MachineCounts=np.array([200,0,0,0,0])
                       #W      I    B      R    S
eigen_matrix = np.array([[0.86,0.1,0.04,0],
                        [0.93,0.05,0.02,0.0],
                        [0.0,0.0,0.8,0.2],
                        [0.1,0.5,0.0,0.4]])
n=24

finalGraph=np.empty((5,n))
i=0


loop = True


for i in range(n):
    
    MachineCounts=np.dot(MachineCounts.T,eigen_matrix) 
    MachineCounts = MachineCounts.T
    MachineCounts[4]=MachineCounts[1]
    MachineCounts[1]=0
    finalGraph[:,i]= MachineCounts.flatten()
    print(MachineCounts,"\n")

    
    

print('number of iterations',i)
plt.title('Colored Line Graph Example')
plt.xlabel('hours')
plt.ylabel('machine conditions')


#plotting all the rows 
#print(finalGraph)
plt.plot(finalGraph[0],color='black',label='working', linestyle='-', linewidth=2)
plt.plot(finalGraph[1],color='red',label='idle', linestyle='-', linewidth=2)
plt.plot(finalGraph[2],color='blue',label='broken', linestyle='-', linewidth=2)
plt.plot(finalGraph[3],color='green',label='repair', linestyle='-', linewidth=2)
plt.plot(finalGraph[4],color='grey',label='sold', linestyle='-', linewidth=2)
plt.legend()
plt.grid()
plt.show()
