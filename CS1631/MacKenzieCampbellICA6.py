#
# Andrew MacKenzie & Katherine Campbell
# ICA 6
#

def compute_pay(hourly_wage, hours):
    if hours <= 40:
        pay = hourly_wage * hours
    elif hours > 40:
        pay = hourly_wage * 40
        pay += hourly_wage * 1.5 * (hours-40)
    return pay
