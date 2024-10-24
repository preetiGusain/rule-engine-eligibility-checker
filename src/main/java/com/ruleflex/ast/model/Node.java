package com.ruleflex.ast.model;

//Node Class representing AST
public class Node {
    private String type; //operand or operator
    private Node left; //Left child node (operator)
    private Node right; //Right child node (operator)
    private String value; //Value for operand node (age/ department)

    public Node(String type, Node left, Node right, String value) {
        this.type = type;
        this.left = left;
        this.right = right;
        this.value = value;
    }

    //Getters and Setters
    public String gettType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
