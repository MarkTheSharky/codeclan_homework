from app import app
from modules import calculator

@app.route('/')
def index():
    return "Welcome!"

@app.route('/add/<num1>/<num2>')
def add(num1, num2):
    return f"The answer is {calculator.add(int(num1),int(num2))}"

@app.route('/subtract/<num1>/<num2>')
def subtract(num1, num2):
    return f"The answer is {calculator.subtract(int(num1),int(num2))}"

@app.route('/multiply/<num1>/<num2>')
def multiply(num1, num2):
    return f"The answer is {calculator.multiply(int(num1),int(num2))}"

@app.route('/divide/<num1>/<num2>')
def divide(num1, num2):
    return f"The answer is {calculator.divide(int(num1),int(num2))}"