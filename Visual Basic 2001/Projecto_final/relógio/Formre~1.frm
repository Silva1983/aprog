VERSION 5.00
Begin VB.Form frmrelógio 
   BackColor       =   &H00C0E0FF&
   Caption         =   "Relógio"
   ClientHeight    =   3375
   ClientLeft      =   60
   ClientTop       =   450
   ClientWidth     =   3435
   DrawMode        =   3  'Not Merge Pen
   Icon            =   "Formre~1.frx":0000
   LinkTopic       =   "Form2"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   MouseIcon       =   "Formre~1.frx":0442
   ScaleHeight     =   3375
   ScaleWidth      =   3435
   StartUpPosition =   2  'CenterScreen
   Begin VB.CommandButton anterior 
      BackColor       =   &H00C0E0FF&
      Cancel          =   -1  'True
      Caption         =   "&Anterior"
      Height          =   375
      Left            =   2520
      MaskColor       =   &H00FFFFFF&
      Style           =   1  'Graphical
      TabIndex        =   1
      Top             =   2880
      Width           =   735
   End
   Begin VB.Timer Timer1 
      Interval        =   1
      Left            =   120
      Top             =   2880
   End
   Begin VB.Timer tmrRelogio 
      Interval        =   1
      Left            =   4080
      Top             =   3480
   End
   Begin VB.Line Segundos 
      BorderColor     =   &H008080FF&
      X1              =   1680
      X2              =   2760
      Y1              =   1560
      Y2              =   1920
   End
   Begin VB.Line Minutos 
      BorderColor     =   &H000000C0&
      X1              =   1680
      X2              =   2520
      Y1              =   1560
      Y2              =   1440
   End
   Begin VB.Line Horas 
      BorderColor     =   &H000000FF&
      BorderWidth     =   2
      X1              =   1680
      X2              =   1680
      Y1              =   1560
      Y2              =   960
   End
   Begin VB.Shape relogio 
      Height          =   2535
      Left            =   0
      Shape           =   3  'Circle
      Top             =   240
      Width           =   3375
   End
   Begin VB.Image Image1 
      Height          =   1065
      Left            =   1200
      Picture         =   "Formre~1.frx":1284
      Top             =   960
      Width           =   1020
   End
   Begin VB.Line Line4 
      X1              =   2880
      X2              =   2760
      Y1              =   1560
      Y2              =   1560
   End
   Begin VB.Line Line3 
      X1              =   480
      X2              =   600
      Y1              =   1560
      Y2              =   1560
   End
   Begin VB.Line Line2 
      X1              =   1680
      X2              =   1680
      Y1              =   2640
      Y2              =   2760
   End
   Begin VB.Line Line1 
      X1              =   1680
      X2              =   1680
      Y1              =   240
      Y2              =   360
   End
   Begin VB.Label lblRelogioDigital 
      Appearance      =   0  'Flat
      AutoSize        =   -1  'True
      BackColor       =   &H00C0E0FF&
      BorderStyle     =   1  'Fixed Single
      ForeColor       =   &H80000008&
      Height          =   255
      Left            =   1320
      TabIndex        =   0
      Top             =   2160
      Width           =   705
   End
End
Attribute VB_Name = "frmrelógio"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim TamanhoPonteiroHoras As Integer
Dim TamanhoPonteiroMinutos As Integer
Dim TamanhoPonteiroSegundos As Integer

Private Sub anterior_Click()
'retorna ao form "ecrã principal"
Unload Me
End Sub

Private Sub Form_Load()
' Calcula o tamanho de cada ponteiro
TamanhoPonteiroHoras = Sqr((Horas.Y2 - Horas.Y1) ^ 2 + (Horas.X2 - Horas.X1) ^ 2)
TamanhoPonteiroMinutos = Sqr((Minutos.Y2 - Minutos.Y1) ^ 2 + (Minutos.X2 - Minutos.X1) ^ 2)
TamanhoPonteiroSegundos = Sqr((Segundos.Y2 - Segundos.Y1) ^ 2 + (Segundos.X2 - Segundos.X1) ^ 2)
End Sub

Private Sub tmrRelogio_Timer()
Dim s As Integer 'Representa os segundos
Dim m As Integer 'Representa os minutos
Dim h As Integer 'Representa a hora
Dim r As Date    'É a hora usando no relógio digital
r = Time$
lblRelogioDigital.Caption = r
s = Second(r)
m = Minute(r)
h = Hour(r)
'# Faz rodar os ponteiros ou seja:
'   Para 60 seg/min rodados, o ponteiro dá uma volta de
'   2 * PI radianos, então para 1 seg/min, a volta é de
'   2 * PI / 60 radianos
'   Isto pode ser visto por regra 3 simples
Dim TetaSeg As Double
Dim TetaMin As Double
Dim TetaHora As Double
TetaSeg = s * (2 * 3.141592654 / 60)
TetaMin = m * (2 * 3.141592654 / 60)
TetaHora = h * (2 * 3.141592654 / 12)
'
With Segundos
    .X2 = .X1 + (Sin(TetaSeg) * TamanhoPonteiroSegundos)
    .Y2 = .Y1 - (Cos(TetaSeg) * TamanhoPonteiroSegundos)
End With
With Minutos
    .X2 = .X1 + (Sin(TetaMin) * TamanhoPonteiroMinutos)
    .Y2 = .Y1 - (Cos(TetaMin) * TamanhoPonteiroMinutos)
End With
With Horas
    .X2 = .X1 + (Sin(TetaHora) * TamanhoPonteiroHoras)
    .Y2 = .Y1 - (Cos(TetaHora) * TamanhoPonteiroHoras)
End With

End Sub
