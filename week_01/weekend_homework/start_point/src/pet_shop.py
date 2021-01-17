

def get_pet_shop_name(pet_shop):
    name = pet_shop["name"]
    return name

def get_total_cash(pet_shop):
    sum = pet_shop["admin"]["total_cash"]
    return sum

# def add_or_remove_cash(total, add):

# def add_or_remove_cash(total, remove):

def get_pets_sold(pet_shop):
    sold = pet_shop["admin"]["pets_sold"]
    return sold

# def increase_pets_sold(pet_shop, pets_sold):
#     sold = pet_shop["admin"]["pets_sold"]
#     sold += pets_sold

def get_stock_count(stock_count):
    count = stock_count["pets"]
    return len(count)