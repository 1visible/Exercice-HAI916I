int f(Object target) {
    int i = 0;
    for (Object elem: this.elements) {
        if (elem.equals(target)) {
            return i;
        }
        i++;
    }
    return -1;
}

/*
OUTPUT

Original name:  f
        (0.939002) predicted: ['index', 'of']
        (0.030483) predicted: ['get', 'index']
        (0.009410) predicted: ['get', 'child', 'index']
        (0.005901) predicted: ['find', 'item']
        (0.003169) predicted: ['get', 'tab', 'index']
        (0.002887) predicted: ['get', 'row', 'index']
        (0.002884) predicted: ['get', 'instruction', 'index']
        (0.002445) predicted: ['find', 'index', 'of']
        (0.002067) predicted: ['get', 'component', 'index']
        (0.001753) predicted: ['get', 'element', 'position']
Attention:
0.156143        context: i,(NameExpr0)^(UnaryExpr:posIncrement)^(ExpressionStmt)^(BlockStmt)^(ForeachStmt)^(BlockStmt)_(ReturnStmt)_(UnaryExpr:negative)_(IntegerLiteralExpr0),1
0.135373        context: 0,(IntegerLiteralExpr1)^(VariableDeclarator)^(VariableDeclarationExpr)^(ExpressionStmt)^(BlockStmt)_(ReturnStmt)_(UnaryExpr:negative)_(IntegerLiteralExpr0),1
0.095825        context: target,(NameExpr2)^(MethodCallExpr)^(IfStmt)^(BlockStmt)^(ForeachStmt)^(BlockStmt)_(ReturnStmt)_(UnaryExpr:negative)_(IntegerLiteralExpr0),1
0.065408        context: elements,(NameExpr2)^(FieldAccessExpr)^(ForeachStmt)_(BlockStmt)_(IfStmt)_(BlockStmt)_(ReturnStmt)_(NameExpr0),i
0.054460        context: int,(PrimitiveType0)^(MethodDeclaration)_(Parameter)_(ClassOrInterfaceType1),object
0.052517        context: target,(VariableDeclaratorId0)^(Parameter)^(MethodDeclaration)_(BlockStmt)_(ReturnStmt)_(UnaryExpr:negative)_(IntegerLiteralExpr0),1
0.051975        context: object,(ClassOrInterfaceType0)^(VariableDeclarationExpr)^(ForeachStmt)_(BlockStmt)_(IfStmt)_(BlockStmt)_(ReturnStmt)_(NameExpr0),i
0.041028        context: elem,(VariableDeclaratorId0)^(VariableDeclarator)^(VariableDeclarationExpr)^(ForeachStmt)^(BlockStmt)_(ReturnStmt)_(UnaryExpr:negative)_(IntegerLiteralExpr0),1
0.035792        context: object,(ClassOrInterfaceType1)^(Parameter)^(MethodDeclaration)_(BlockStmt)_(ReturnStmt)_(UnaryExpr:negative)_(IntegerLiteralExpr0),1
0.023897        context: METHOD_NAME,(NameExpr1)^(MethodDeclaration)_(BlockStmt)_(ReturnStmt)_(UnaryExpr:negative)_(IntegerLiteralExpr0),1
*/