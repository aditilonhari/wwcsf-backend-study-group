require_relative 'ComponentInterface'

# The Composite class represents the complex components that may have children.
# Usually, the Composite objects delegate the actual work to their children and
# then "sum-up" the result.
class Composite
  include ComponentInterface
  def initialize
    @children = []
  end

  # A composite object can add or remove other components (both simple or
  # complex) to or from its child list.

  # @param [Component] component
  def add(component)
    @children.append(component)
    component.parent = self
  end

  # @param [Component] component
  def remove(component)
    @children.remove(component)
    component.parent = nil
  end

  # @return [Boolean]
  def composite?
    true
  end

  # The Composite executes its primary logic in a particular way. It traverses
  # recursively through all its children, collecting and summing their results.
  # Since the composite's children pass these calls to their children and so
  # forth, the whole object tree is traversed as a result.
  def operation
    results = []
    @children.each { |child| results.append(child.operation) }
    "Branch(#{results.join('+')})"
  end
end