Attribute VB_Name = "Module1"
 'Necess�rio para a fun��o intersectRect
    Type trect
        left As Long
        top As Long
        right As Long
        bottom As Long
    End Type
    
    'Fun��o API
    Declare Function IntersectRect Lib "user32" (lpDestRect As trect, lpSrc1Rect As trect, lpSrc2Rect As trect) As Long
