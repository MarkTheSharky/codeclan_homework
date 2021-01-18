

def get_pet_shop_name(pet_shop):
    name = pet_shop["name"]
    return name

def get_total_cash(pet_shop):
    sum = pet_shop["admin"]["total_cash"]
    return sum

def add_or_remove_cash(pet_shop_total, cash_add_or_removed):
    pet_shop_total["admin"]["total_cash"] += cash_add_or_removed

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

def find_pet_by_name(pet_shop, pet_name):
    pet_found = None
    for pet in pet_shop["pets"]:
        if pet["name"] == pet_name:
            pet_found = pet
    return pet_found

# def remove_pet_by_name(pet_shop, pet_name):
#     for pet in pet_shop["pets"]:
#         if pet["name"] == pet_name:
        

def add_pet_to_stock(pet_shop, new_pet):
    current_pets = pet_shop["pets"]
    current_pets.append(new_pet)
    count = pet_shop["pets"]
    return count

