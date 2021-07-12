# Here's the the base interface of another product. All products can interact
# with each other, but proper interaction is possible only between products of
# the same concrete variant.
module AbstractProductBInterface
  # Product B is able to do its own thing...
  def useful_function_b
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end

  # ...but it also can collaborate with the ProductA.
  #
  # The Abstract Factory makes sure that all products it creates are of the same
  # variant and thus, compatible.
  def another_useful_function_b(_collaborator)
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end
end