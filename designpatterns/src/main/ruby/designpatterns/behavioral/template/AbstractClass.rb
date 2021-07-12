# The Abstract Class defines a template method that contains a skeleton of some
# algorithm, composed of calls to (usually) abstract primitive operations.
#
# Concrete subclasses should implement these operations, but leave the template
# method itself intact.
class AbstractClass
  # The template method defines the skeleton of an algorithm.
  def template_method
    base_operation1
    required_operations1
    base_operation2
    hook1
    required_operations2
    base_operation3
    hook2
  end

  # These operations already have implementations.

  def base_operation1
    puts 'AbstractClass says: I am doing the bulk of the work'
  end

  def base_operation2
    puts 'AbstractClass says: But I let subclasses override some operations'
  end

  def base_operation3
    puts 'AbstractClass says: But I am doing the bulk of the work anyway'
  end

  # These operations have to be implemented in subclasses.
  def required_operations1
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end

  # @abstract
  def required_operations2
    raise NotImplementedError, "#{self.class} has not implemented method '#{__method__}'"
  end

  # These are "hooks." Subclasses may override them, but it's not mandatory
  # since the hooks already have default (but empty) implementation. Hooks
  # provide additional extension points in some crucial places of the algorithm.

  def hook1; end

  def hook2; end
end