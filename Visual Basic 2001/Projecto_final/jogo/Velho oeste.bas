Attribute VB_Name = "velhooeste"

    
    'Necessário para a função intersectRect
    Type trect
        left As Long
        top As Long
        right As Long
        bottom As Long
    End Type
    
    'Função API
    Declare Function IntersectRect Lib "user32" (lpDestRect As trect, lpSrc1Rect As trect, lpSrc2Rect As trect) As Long
    
