# this code implements based on Sieve_of_Eratosthenes


# This algorithm which is more efficiebt than usual programs due to large numbers (E.g print the sum of all prime below 2000000)

def seive_of_eratosthens(limit):
    seive = [True] * (limit+1)
    seive[0]=seive[1] = False
    for i in range(2,limit//2+1):
        if seive[i]:
            for j in range(i**2,limit+1,i):
                seive[j] = False
    primes = [num for num in range(2,limit+1) if seive[num]]
    return sum(primes)
print(seive_of_eratosthens(2000000))
