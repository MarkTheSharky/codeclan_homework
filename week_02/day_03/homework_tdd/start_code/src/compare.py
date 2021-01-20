def compare(num1, num2):
    is_greater_than = f"{num1} is greater than {num2}"
    is_not_greater_than = f"{num1} is NOT greater than {num2}"
    if isinstance(num1, (int, float)) and isinstance(num2, (int, float)):
        if num1 > num2:
            return is_greater_than
        else:
            return is_not_greater_than
    else:
        return "Sorry, a number is required"
