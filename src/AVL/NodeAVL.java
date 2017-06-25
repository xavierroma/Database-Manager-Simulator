package AVL;

import DBMSi.TableRow;

import java.util.ArrayList;

/**
 * Created by ClaudiaPeiro on 21/6/17
 *
 * Classe que gestionarà els nodes d'AVL.AVL. Contindrà la informació relativa a la fila
 * i cursors als fills esquerres i dretes respectivament.
 */
public class NodeAVL {
    private TableRow root;
    private NodeAVL childRight, childLeft, parent;
    private int balance;
    private int height;


    public NodeAVL(TableRow root) {
        this.root = root;
    }

    public TableRow getRoot() {
        return root;
    }

    public void setRoot(TableRow row) {
        this.root = row;
    }

    public NodeAVL getParent () {
        return parent;
    }

    public NodeAVL getChildRight() {
        return childRight;
    }

    public void setChildRight(NodeAVL childRight) {
        this.childRight = childRight;
    }

    public NodeAVL getChildLeft() {
        return childLeft;
    }

    public void setChildLeft(NodeAVL childLeft) {
        this.childLeft = childLeft;
    }

    public void setParent (NodeAVL parent) { this.parent = parent; }

    /**
     * Mètode que servirà per saber si té fill esquerra
     * @return cert en cas que en tingui
     */
    public boolean isChildLeft() {
        return childLeft != null;
    }

    /**
     * Mètode que servirà per saber si té fill dret
     * @return cert en cas que en tingui
     */
    public boolean isChildRight() {
        return childRight != null;
    }

    public void setExistanceChildLeft() {
        childLeft = null;
    }

    public void setExistanceChildRight() {
        childRight = null;
    }
}
