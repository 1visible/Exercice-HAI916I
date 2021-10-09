String[] f(final String[] array) {
    final String[] newArray = new String[array.length];
    for (int index = 0; index < array.length; index++) {
        newArray[array.length - index - 1] = array[index];
    }
    return newArray;
}

/*
OUTPUT

Original name:  f
        (0.993408) predicted: ['reverse', 'array']
        (0.001881) predicted: ['reverse']
        (0.001596) predicted: ['new', 'array']
        (0.000628) predicted: ['realloc', 'array']
        (0.000568) predicted: ['sort']
        (0.000503) predicted: ['copy']
        (0.000479) predicted: ['autobox']
        (0.000459) predicted: ['clone']
        (0.000268) predicted: ['to', 'object', 'array']
        (0.000210) predicted: ['union']
Attention:
0.412334        context: newarray,(NameExpr0)^(ArrayAccessExpr0)_(BinaryExpr:minus)_(BinaryExpr:minus)_(FieldAccessExpr0)_(NameExpr0),array
0.051825        context: 1,(IntegerLiteralExpr1)^(BinaryExpr:minus1)^(ArrayAccessExpr0)^(AssignExpr:assign)_(ArrayAccessExpr1)_(NameExpr1),index
0.046923        context: [],(ArrayBracketPair3)^(MethodDeclaration)_(BlockStmt)_(ReturnStmt)_(NameExpr0),newarray
0.045532        context: [],(ArrayBracketPair3)^(MethodDeclaration)_(BlockStmt)_(ForStmt)_(BlockStmt)_(ExpressionStmt)_(AssignExpr:assign0)_(ArrayAccessExpr1)_(NameExpr1),index
0.034208        context: newarray,(NameExpr0)^(ArrayAccessExpr0)_(BinaryExpr:minus)_(BinaryExpr:minus)_(NameExpr1),index
0.030993        context: array,(NameExpr0)^(ArrayAccessExpr1)^(AssignExpr:assign)^(ExpressionStmt)^(BlockStmt)^(ForStmt)^(BlockStmt)_(ReturnStmt)_(NameExpr0),newarray
0.030984        context: [],(ArrayBracketPair3)^(MethodDeclaration)_(BlockStmt)_(ForStmt)_(BlockStmt)_(ExpressionStmt)_(AssignExpr:assign0)_(ArrayAccessExpr1)_(NameExpr0),array
0.030267        context: string,(ClassOrInterfaceType0)^(MethodDeclaration)_(Parameter)_(ArrayBracketPair2),[]
0.028901        context: [],(ArrayBracketPair3)^(MethodDeclaration)_(BlockStmt)_(ForStmt)_(BlockStmt)_(ExpressionStmt)_(AssignExpr:assign0)_(ArrayAccessExpr0)_(NameExpr0),newarray
0.021496        context: string,(ClassOrInterfaceType1)^(ArrayCreationExpr)^(VariableDeclarator)^(VariableDeclarationExpr)^(ExpressionStmt)^(BlockStmt)_(ReturnStmt)_(NameExpr0),newarray
*/