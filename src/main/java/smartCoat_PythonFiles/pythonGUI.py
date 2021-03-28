from tkinter import *

root = Tk()
#Creating a widget 
myLabel = Label(root, text="Please enter your prefered Temp")
#push it onto the screen
myLabel.pack(pady = 10)

#create entry field
setTemp = Entry(root, text="Enter temp Value")
setTemp.pack(pady=10)

#create button
setTemp_button = Button(root, text="Set Temp")
setTemp_button.pack(pady=10)

#create entry field
mainReply = Entry(root, text=" ")
mainReply.pack(pady=40)


root.mainloop()