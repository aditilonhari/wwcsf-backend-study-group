# Each distinct product of a product family should have a base interface. All
# variants of the product must implement this interface.
module AbstractProductAInterface
  # @abstract
  #
  # @return [String]
  def useful_function_a
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end
end