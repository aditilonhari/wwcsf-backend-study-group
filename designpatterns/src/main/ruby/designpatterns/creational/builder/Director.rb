# The Director is only responsible for executing the building steps in a
# particular sequence. It is helpful when producing products according to a
# specific order or configuration. Strictly speaking, the Director class is
# optional, since the client can control builders directly.
class Director
  # @return [Builder]
  attr_accessor :builder

  def initialize
    @builder = nil
  end

  # The Director works with any builder instance that the client code passes to
  # it. This way, the client code may alter the final type of the newly
  # assembled product.
  def builder=(builder)
    @builder = builder
  end

  # The Director can construct several product variations using the same
  # building steps.

  def build_minimal_viable_product
    @builder.produce_part_a
  end

  def build_full_featured_product
    @builder.produce_part_a
    @builder.produce_part_b
    @builder.produce_part_c
  end
end