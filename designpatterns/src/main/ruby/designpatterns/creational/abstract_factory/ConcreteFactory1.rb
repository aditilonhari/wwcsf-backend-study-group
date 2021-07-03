require_relative 'AbstractFactoryInterface'
require_relative 'ConcreteProductA1'
require_relative 'ConcreteProductB1'

# Concrete Factories produce a family of products that belong to a single
# variant. The factory guarantees that resulting products are compatible. Note
# that signatures of the Concrete Factory's methods return an abstract product,
# while inside the method a concrete product is instantiated.
class ConcreteFactory1
  include AbstractFactoryInterface

  def create_product_a
    ConcreteProductA1.new
  end

  def create_product_b
    ConcreteProductB1.new
  end
end