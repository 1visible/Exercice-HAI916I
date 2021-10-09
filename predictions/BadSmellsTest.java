String[] f(final String[] array, String target) {
    final String[] newArray = new String[array.length];
    boolean b = false;

    for (int index = 0; index < array.length; index++) {
        newArray[array.length - index - 1] = array[index];

        if(array[index].equals(target)) {
            b = true;
        }
    }

    return newArray;
}

/*
OUTPUT

Original name:  f
        (0.324108) predicted: ['sub', 'array']
        (0.208008) predicted: ['new', 'array']
        (0.138057) predicted: ['concat']
        (0.087230) predicted: ['join']
        (0.064655) predicted: ['concatenate']
        (0.040958) predicted: ['to', 'string', 'array']
        (0.040472) predicted: ['get', 'array']
        (0.033583) predicted: ['prepend']
        (0.032400) predicted: ['to', 'object', 'array']
        (0.030527) predicted: ['wrap']
Attention:
0.104568        context: [],(ArrayBracketPair4)^(MethodDeclaration)_(BlockStmt)_(ForStmt)_(BlockStmt)_(ExpressionStmt)_(AssignExpr:assign0)_(ArrayAccessExpr1)_(NameExpr1),index
0.093179        context: [],(ArrayBracketPair4)^(MethodDeclaration)_(BlockStmt)_(ForStmt)_(BlockStmt)_(IfStmt)_(MethodCallExpr0)_(NameExpr2),target
0.081652        context: [],(ArrayBracketPair4)^(MethodDeclaration)_(BlockStmt)_(ReturnStmt)_(NameExpr0),newarray
0.076450        context: [],(ArrayBracketPair4)^(MethodDeclaration)_(BlockStmt)_(ForStmt)_(BlockStmt)_(ExpressionStmt)_(AssignExpr:assign0)_(ArrayAccessExpr1)_(NameExpr0),array
0.057263        context: string,(ClassOrInterfaceType0)^(MethodDeclaration)_(Parameter)_(ArrayBracketPair2),[]
0.051135        context: [],(ArrayBracketPair4)^(MethodDeclaration)_(BlockStmt)_(ForStmt)_(BlockStmt)_(ExpressionStmt)_(AssignExpr:assign0)_(ArrayAccessExpr0)_(NameExpr0),newarray
0.048628        context: target,(VariableDeclaratorId0)^(Parameter)^(MethodDeclaration)_(ArrayBracketPair4),[]
0.046660        context: [],(ArrayBracketPair4)^(MethodDeclaration)_(BlockStmt)_(ForStmt)_(BinaryExpr:less)_(FieldAccessExpr1)_(NameExpr2),length
0.033184        context: string,(ClassOrInterfaceType0)^(MethodDeclaration)_(NameExpr1),METHOD_NAME
0.026677        context: [],(ArrayBracketPair4)^(MethodDeclaration)_(BlockStmt)_(ExpressionStmt)_(VariableDeclarationExpr)_(VariableDeclarator)_(ArrayCreationExpr)_(ClassOrInterfaceType1),string
*/