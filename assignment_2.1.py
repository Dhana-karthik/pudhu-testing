import sklearn.datasets 


faces = sklearn.datasets.fetch_olivetti_faces() 
Xall = faces.data.T 


print(Xall.shape) 
print(Xall.min(), Xall.max()) 

Xsub = Xall[:,0:200] 

print(Xsub.shape)
