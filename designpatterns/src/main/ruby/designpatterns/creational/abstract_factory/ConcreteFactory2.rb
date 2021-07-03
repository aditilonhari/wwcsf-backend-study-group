require_relative 'AbstractFactoryInterface'
require_relative 'ConcreteProductA2'
require_relative 'ConcreteProductB2'

# Each Concrete Factory has a corresponding product variant.
class ConcreteFactory2 
  include AbstractFactoryInterface

  def create_product_a
    ConcreteProductA2.new
  end

  def create_product_b
    ConcreteProductB2.new
  end
end
