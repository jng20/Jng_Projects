try:
    hours = input('Enter Hours: ')
    float(hours)
    rate =  input('Enter Rate: ')
    if float(hours) > 40:
        pay = float((40 * float(rate)) + (1.5 * float(rate) * (float(hours) - 40)))
    else:
        pay = float(hours) * float(rate)
    print(pay)
except:
    print("Please enter a numeric value")

#try:
#    rate =  input('Enter Rate: ')
#    float(rate)
#except:
#    print("Please enter a numeric value")
#    return
#if float(hours) > 40:
#    pay = float((40 * float(rate)) + (1.5 * float(rate) * (float(hours) - 40)))
#else:
#    pay = float(hours) * float(rate)
#print(pay)
