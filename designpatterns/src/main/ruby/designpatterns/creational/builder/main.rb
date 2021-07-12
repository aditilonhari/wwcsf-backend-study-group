require_relative 'Director'
require_relative 'ConcreteBuilder1'

# The client code creates a builder object, passes it to the director and then
# initiates the construction process. The end result is retrieved from the
# builder object.

director = Director.new
builder = ConcreteBuilder1.new
director.builder = builder

puts 'Standard basic product: '
director.build_minimal_viable_product
builder.product.list_parts

puts "\n\n"

puts 'Standard full featured product: '
director.build_full_featured_product
builder.product.list_parts

puts "\n\n"

# Remember, the Builder pattern can be used without a Director class.
puts 'Custom product: '
builder.produce_part_a
builder.produce_part_b
builder.product.list_parts
