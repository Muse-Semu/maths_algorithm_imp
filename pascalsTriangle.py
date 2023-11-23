def pascal(n):
    ls =[]
    sublis= []
    for i in range(n+1):
        for j in range(0,i+1):
            sublis.append(combination(i,j))
        ls.append(sublis)
        sublis = []
    return ls
    
def combination(c,k):
    return  fact(c)//(fact(k)*fact(c-k))
    
def fact(n):
    f = 1
    for i in range(1,n+1):
        f=f*i
    return f

n = int(input(" Enter number of row :  ==> "))
p=(pascal(n-1))
for row in p:
    print(f' {" "*(len(p)-len(row))}{row} ')
print(f'{"*"*100}\n {n}th row of pascal triangle is : \n',p[n-1])