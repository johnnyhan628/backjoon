'''
*복습
딕셔너리에서 어떻게 키로 값을 출력할 수 있는지 복습
'''

import sys

N, M = map(int, sys.stdin.readline().split())

pokemon_number_dict= {} #key가 숫자인 애
pokemon_name_dict = {}  #key가 이름인 애

for i in range(N) :
    pokemon_name = sys.stdin.readline().strip()
    pokemon_number_dict[i+1] = pokemon_name
    pokemon_name_dict[pokemon_name] = i+1
    
for _ in range(M) :
    pokemon = sys.stdin.readline().strip()
    if pokemon.isdigit() :
        print(pokemon_number_dict[int(pokemon)])
    else :
        print(int(pokemon_name_dict[pokemon]))