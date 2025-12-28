#include <iostream>
using namespace std;

class tree;

class node {
private:
    int val;
    node *left, *right;
public:
    node(int v) {
        val = v;
        left = NULL;
        right = NULL;
    }
    friend class tree;
};

class tree {
private:
    node *root;
public:
    tree() {
        root = NULL;
    }
    void add(int v) {
        node *nn = new node(v);
        if(root == NULL)
            root = nn;
        else {
            node *trav = root;
            while(true) {
                if(v < trav->val) {
                    if(trav->left == NULL) {
                        trav->left = nn;
                        break;
                    }
                    trav = trav->left;
                }
                else {
                    if(trav->right == NULL) {
                        trav->right = nn;
                         break;
                    }
                    trav = trav->right;
                }
            }
        }
    }
    void preorder(node *trav) {
        if(trav == NULL)
            return;
        cout << trav->val << ", ";
        preorder(trav->left);
        preorder(trav->right);
    }
    void preorder() {
        cout << "PRE: ";
        preorder(root);
        cout << endl;
    }

    void delAll(node *trav) {
        delAll(trav->left);
        delAll(trav->right);
        delete trav;
    }
    void delAll() {
        delAll(root);
        root = NULL;
    }
    ~tree() {
        delAll();
    }
    //friend int main(); // bad practice to make main() as friend of a class
};

int main() {
    tree t;
    t.add(50);
    t.add(25);
    t.add(75);
    t.add(10);
    t.add(35);
    t.add(60);
    t.add(90);
    t.add(30);
    t.add(40);
    t.preorder();
    //t.delAll();
    return 0;
}
