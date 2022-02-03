hours = input('Enter Hours: ')
rate =  input('Enter Rate: ')
if float(hours) > 40:
    pay = float((40 * float(rate)) + (1.5 * float(rate) * (float(hours) - 40)))
else:
    pay = float(hours) * float(rate)
print(pay)
