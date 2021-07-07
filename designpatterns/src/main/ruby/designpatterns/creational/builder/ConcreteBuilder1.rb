require_relative 'BuilderInterface'
require_relative 'Product1'

# The Concrete Builder classes follow the Builder interface and provide specific
# implementations of the building steps. Your program may have several
# variations of Builders, implemented differently.
class ConcreteBuilder1
  include BuilderInterface
  
  # A fresh builder instance should contain a blank product object, which is
  # used in further assembly.
  def initialize
    reset
  end

  def reset
    @product = Product1.new
  end

  # Concrete Builders are supposed to provide their own methods for retrieving
  # results. That's because various types of builders may create entirely
  # different products that don't follow the same interface. Therefore, such
  # methods cannot be declared in the base Builder interface (at least in a
  # statically typed programming language).
  #
  # Usually, after returning the end result to the client, a builder instance is
  # expected to be ready to start producing another product. That's why it's a
  # usual practice to call the reset method at the end of the `getProduct`
  # method body. However, this behavior is not mandatory, and you can make your
  # builders wait for an explicit reset call from the client code before
  # disposing of the previous result.
  def product
    product = @product
    reset
    product
  end

  def produce_part_a
    @product.add('PartA1')
  end

  def produce_part_b
    @product.add('PartB1')
  end

  def produce_part_c
    @product.add('PartC1')
  end
end