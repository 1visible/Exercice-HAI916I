void f(int[] array) {
    boolean swapped = true;
    for (int i = 0; i < array.length && swapped; i++) {
        swapped = false;
        for (int j = 0; j < array.length - 1 - i; j++) {
           if (array[j] > array[j+1]) {
               int temp = array[j];
               array[j] = array[j+1];
               array[j+1]= temp;
               swapped = true;
           }
        }
    }
}

/*
OUTPUT

Original name:  f
        (0.921215) predicted: ['test', 'swap']
        (0.032008) predicted: ['bubble', 'sort']
        (0.009010) predicted: ['visit', 'binary', 'spatial', 'operator']
        (0.008272) predicted: ['median']
        (0.007491) predicted: ['sort']
        (0.005653) predicted: ['is', 'satisfied']
        (0.004512) predicted: ['is', 'sorted']
        (0.004140) predicted: ['to', 'int', 'array']
        (0.003978) predicted: ['to', 'boolean', 'array']
        (0.003720) predicted: ['get', 'segments']
Attention:
0.318976        context: swapped,(NameExpr0)^(AssignExpr:assign)^(ExpressionStmt)^(BlockStmt)_(ForStmt)_(BinaryExpr:less)_(BinaryExpr:minus)_(NameExpr1),i
0.118474        context: array,(VariableDeclaratorId0)^(Parameter)^(MethodDeclaration)_(BlockStmt)_(ForStmt)_(BinaryExpr:and)_(NameExpr1),swapped
0.072763        context: swapped,(NameExpr0)^(AssignExpr:assign)_(BooleanLiteralExpr1),false
0.053214        context: int,(PrimitiveType1)^(Parameter)^(MethodDeclaration)_(BlockStmt)_(ForStmt)_(BinaryExpr:and)_(BinaryExpr:less)_(FieldAccessExpr1)_(NameExpr0),array
0.050526        context: true,(BooleanLiteralExpr1)^(VariableDeclarator)^(VariableDeclarationExpr)^(ExpressionStmt)^(BlockStmt)_(ForStmt)_(BinaryExpr:and)_(NameExpr1),swapped
0.043725        context: swapped,(NameExpr1)^(BinaryExpr:and)^(ForStmt)_(VariableDeclarationExpr)_(VariableDeclarator)_(VariableDeclaratorId0),i
0.039215        context: array,(NameExpr0)^(FieldAccessExpr)^(BinaryExpr:less)^(BinaryExpr:and)_(NameExpr1),swapped
0.035276        context: swapped,(VariableDeclaratorId0)^(VariableDeclarator)^(VariableDeclarationExpr)^(ExpressionStmt)^(BlockStmt)_(ForStmt)_(BinaryExpr:and)_(NameExpr1),swapped
0.030012        context: swapped,(NameExpr1)^(BinaryExpr:and)^(ForStmt)_(VariableDeclarationExpr)_(PrimitiveType0),int
0.029819        context: [],(ArrayBracketPair2)^(Parameter)^(MethodDeclaration)_(BlockStmt)_(ForStmt)_(BlockStmt)_(ExpressionStmt)_(AssignExpr:assign0)_(BooleanLiteralExpr1),false
*/