boolean f(Object target) {
    for (Object elem: this.elements) {
        if (elem.equals(target)) {
            return true;
        }
    }
    return false;
}

/*
OUTPUT

Original name:  f
        (0.932174) predicted: ['contains']
        (0.055137) predicted: ['matches']
        (0.007419) predicted: ['accept']
        (0.001914) predicted: ['match']
        (0.000919) predicted: ['filter']
        (0.000670) predicted: ['contains', 'exact']
        (0.000536) predicted: ['contains', 'key']
        (0.000509) predicted: ['eq']
        (0.000392) predicted: ['evaluate']
        (0.000329) predicted: ['contains', 'element']
Attention:
0.154106        context: this,(ThisExpr0)^(FieldAccessExpr)^(ForeachStmt)^(BlockStmt)_(ReturnStmt)_(BooleanLiteralExpr0),false
0.138101        context: elements,(NameExpr2)^(FieldAccessExpr)^(ForeachStmt)_(BlockStmt)_(IfStmt)_(BlockStmt)_(ReturnStmt)_(BooleanLiteralExpr0),true
0.117108        context: elements,(NameExpr2)^(FieldAccessExpr)^(ForeachStmt)^(BlockStmt)_(ReturnStmt)_(BooleanLiteralExpr0),false
0.057865        context: target,(VariableDeclaratorId0)^(Parameter)^(MethodDeclaration)_(BlockStmt)_(ReturnStmt)_(BooleanLiteralExpr0),false
0.046924        context: elem,(NameExpr0)^(MethodCallExpr)^(IfStmt)^(BlockStmt)^(ForeachStmt)^(BlockStmt)_(ReturnStmt)_(BooleanLiteralExpr0),false
0.046475        context: boolean,(PrimitiveType0)^(MethodDeclaration)_(Parameter)_(ClassOrInterfaceType1),object
0.043912        context: METHOD_NAME,(NameExpr1)^(MethodDeclaration)_(BlockStmt)_(ReturnStmt)_(BooleanLiteralExpr0),false
0.034395        context: this,(ThisExpr0)^(FieldAccessExpr)_(NameExpr2),elements
0.034259        context: boolean,(PrimitiveType0)^(MethodDeclaration)_(NameExpr1),METHOD_NAME
0.032852        context: boolean,(PrimitiveType0)^(MethodDeclaration)_(Parameter)_(VariableDeclaratorId0),target
*/