'''
class dog:
    def __init__(self,name,age):
        self.name = name
        self.age = age

    def sit(self):
        print(f"{self.name} is now sitting")

    def roll_over(self):
        print(f"{self.name} is now roll overed")

    def bark(self):
        print(f"{self.name} is now barking at you")

    def command(self):
        command = input(f"enter the command that you want from {self.name} : ")
        print(f"now {self.name} following your command for {command} ")

    def save(self):
        file = 'dog.txt'
        with open(file, 'w') as filesave:
            filesave.write(f"{self.sit}, {self.roll_over}, {self.bark}, {self.command}")

mydog = dog('ganesh',4)
mydog.sit()
mydog.roll_over()
mydog.bark()
mydog.command()
mydog.save()
print(f"my dog name is {mydog.name}")
print(f"and my dogs age is {mydog.age}")
'''     
n=5
for i in range(1, n+1):
    for j in range(1,i+1):
        print("*", end=" ")
        
    print("")