class Tree
    attr_accessor :children, :node_name
    def initialize (tree)


 		@node_name = tree.keys[0]
 		temp = tree.values[0]
        @children = temp.map {|keys, values| Tree.new({keys => values})}
       



        
    end
    def visit_all(&block)
        visit &block
        children.each {|child| child.visit_all &block}
    end
    def visit(&block)
        block.call self
    end
    def numLeaves
        counter = 0
        visit_all {|value| 
            if value.children == []
                counter += 1
            end
            }
            return counter
    end
end



ruby_tree = Tree.new({
    'ggp' => {
        'gp1' =>
            { 'p1' => {'child1' => {}, 'child2' => {}},
              'p2' => {'child3' => {}}
            },
        'gp2' =>
            { 'p3' => {'child4' => {}},
              'p4' => {'child5' => {}, 'child6' => {}}
            },
        'gp3' =>
            { 'p5' => {'child7' => {}},
              'p6' => {'child8' => {}}
            }
    }
})

numNodes = 0
ruby_tree.visit_all {|i|
	puts i.node_name
	numNodes += 1
}
p "The total number of nodes in the tree is #{numNodes}"
p "The total number of leaves in the tree are #{ruby_tree.numLeaves()}"
