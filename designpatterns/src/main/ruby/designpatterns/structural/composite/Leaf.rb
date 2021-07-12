require_relative 'ComponentInterface'
# The Leaf class represents the end objects of a composition. A leaf can't have
# any children.
#
# Usually, it's the Leaf objects that do the actual work, whereas Composite
# objects only delegate to their sub-components.
class Leaf
  include ComponentInterface
  # return [String]
  def operation
    'Leaf'
  end
end