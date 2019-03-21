VERSION 5.00
Begin VB.Form frmautor 
   BackColor       =   &H00FFFFFF&
   BorderStyle     =   1  'Fixed Single
   Caption         =   "Autor"
   ClientHeight    =   6825
   ClientLeft      =   45
   ClientTop       =   435
   ClientWidth     =   8730
   Icon            =   "frmautor.frx":0000
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   Picture         =   "frmautor.frx":0442
   ScaleHeight     =   6825
   ScaleWidth      =   8730
   StartUpPosition =   2  'CenterScreen
   Begin VB.CommandButton cmdrelogio 
      BackColor       =   &H00C0C0C0&
      Caption         =   "Relógio"
      Height          =   495
      Left            =   960
      Style           =   1  'Graphical
      TabIndex        =   4
      Top             =   3000
      Width           =   1215
   End
   Begin VB.Timer Timerautor 
      Interval        =   1500
      Left            =   360
      Top             =   5880
   End
   Begin VB.CommandButton cmdanterior 
      BackColor       =   &H00C0C0C0&
      Caption         =   "Voltar ao Ecrã Principal"
      Height          =   495
      Left            =   960
      Style           =   1  'Graphical
      TabIndex        =   0
      Top             =   4560
      Width           =   1215
   End
   Begin VB.Label lblelaborado 
      BackColor       =   &H00000000&
      Caption         =   "Trabalho Elaborado por:"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   495
      Left            =   240
      TabIndex        =   3
      Top             =   120
      Width           =   3975
   End
   Begin VB.Label lblantonio 
      Alignment       =   2  'Center
      BackColor       =   &H00000000&
      Caption         =   "António Silva nº 1"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   495
      Left            =   4800
      TabIndex        =   2
      Top             =   3960
      Visible         =   0   'False
      Width           =   2775
   End
   Begin VB.Label lblsimao 
      Alignment       =   2  'Center
      BackColor       =   &H00000000&
      Caption         =   "Simão Cardeal nº 23"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   495
      Left            =   4680
      TabIndex        =   1
      Top             =   3960
      Width           =   3135
   End
End
Attribute VB_Name = "frmautor"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim a As Integer

Private Sub cmdanterior_Click()
'Retorna ao form "ecrã principal"
frmautor.Hide
frmprincipal.Show
End Sub

Private Sub cmdrelogio_Click()
'Abre o form "relógio"
frmrelógio.Show
End Sub

Private Sub Timerautor_Timer()
'coloca as label's com o nome dos autores a piscar
If (lblsimao.Visible = True) Then
    lblsimao.Visible = False
    lblantonio.Visible = True
Else
    lblsimao.Visible = True
    lblantonio.Visible = False
End If
End Sub
