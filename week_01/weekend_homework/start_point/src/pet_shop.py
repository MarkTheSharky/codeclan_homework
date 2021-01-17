

def get_pet_shop_name(pet_shop):
    name = pet_shop["name"]
    return name

def get_total_cash(pet_shop):
    sum = pet_shop["admin"]["total_cash"]
    return sum

def add_or_remove_cash(pet_shop_total, add):
    pet_shop_total["admin"]["total_cash"] += add

def get_pets_sold(pet_shop):
    sold = pet_shop["admin"]["pets_sold"]
    return sold

def increase_pets_sold(pet_shop, pets_sold):
    pet_shop["admin"]["pets_sold"] += pets_sold

def get_stock_count(stock_count):
    count = stock_count["pets"]
    return len(count)

def get_pets_by_breed(pet_shop, breed):
    pet_breed = []
    for pets in pet_shop["pets"]:
        if breed == pets["breed"]:
            pet_breed.append(pets)
    return pet_breed

# def find_pet_by_name(pet_shop, pet_name):
#     pet_name = []
#     for name in pet_shop["pets"]:
#         if name == pets["pet_name"]:
#             return pets["pet_name"]