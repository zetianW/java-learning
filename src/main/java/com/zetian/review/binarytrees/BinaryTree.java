package com.zetian.review.binarytrees;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/18
 **/
public class BinaryTree {

    private class Node {
        private Comparable data;  //排序的依据就是Comparable
        private Node left;   //保存左节点
        private Node right;   //保存右节点

        public Node(Comparable data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.data.compareTo(newNode.data) > 0) {
                if (this.left == null) {
                    this.left = newNode;
                } else {
                    this.left.addNode(newNode);
                }
            } else {
                if (this.right == null) {
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }

        public void toArrayNode() {
            if (this.left != null) {   //表示有左节点
                this.left.toArrayNode();
            }
            BinaryTree.this.retData[BinaryTree.this.foot++] = this.data;
            if (this.right != null) {
                this.right.toArrayNode(); //右子树输出
            }
        }
    }
    /**
     * 定义根节点
     */
    private Node root;
    /**
     * 保存元素个数
     */
    private int count;
    private Object[] retData;
    private int foot;
    /**
     * 进行数据的追加，
     * 但是所有的Object都必须变为Comparable
     *
     * @param obj
     */
    public void add(Object obj) {
        /**
         * 必须强制转换为Comparable才能进行Node的保存
         */
        Comparable com = (Comparable) obj;
        /**
         * 创建新的节点
         */
        Node newNode = new Node(com);
        /**
         * 现在不存在根节点
         */
        if (this.root == null) {
            /**
             * 保存根节点
             */
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    public Object[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.foot = 0;
        this.retData = new Object[this.count];
        this.root.toArrayNode();
        return this.retData;
    }
}
