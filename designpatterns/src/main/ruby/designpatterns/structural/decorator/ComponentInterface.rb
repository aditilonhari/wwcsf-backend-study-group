# The base Component interface defines operations that can be altered by
# decorators.
module ComponentInterface
  # @return [String]
  def operation
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end
end