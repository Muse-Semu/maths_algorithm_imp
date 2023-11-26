# this code implements based on Sieve_of_Eratosthenes

# In mathematics, the sieve of Eratosthenes is an ancient algorithm for finding all prime numbers up to any given limit.
# It does so by iteratively marking as composite (i.e., not prime) the multiples of each prime, starting with the first prime number, 2. 
# The multiples of a given prime are generated as a sequence of numbers starting from that prime, with constant difference between them that is equal to that prime.
# [1] This is the sieve's key distinction from using trial division to sequentially test each candidate number for divisibility by each prime.[2] 
# Once all the multiples of each discovered prime have been marked as composites, the remaining unmarked numbers are primes.
# https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

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
