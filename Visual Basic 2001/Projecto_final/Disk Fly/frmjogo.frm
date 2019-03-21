VERSION 5.00
Object = "{22D6F304-B0F6-11D0-94AB-0080C74C7E95}#1.0#0"; "msdxm.ocx"
Begin VB.Form frmDiskFly 
   Caption         =   "DiskFly"
   ClientHeight    =   7995
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   11880
   Icon            =   "frmjogo.frx":0000
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   7995
   ScaleWidth      =   11880
   StartUpPosition =   2  'CenterScreen
   Begin VB.Timer tmrbola 
      Interval        =   50
      Left            =   0
      Top             =   2760
   End
   Begin VB.PictureBox Picture1 
      BackColor       =   &H0000FF00&
      ForeColor       =   &H00000000&
      Height          =   6975
      Left            =   360
      ScaleHeight     =   6915
      ScaleWidth      =   9795
      TabIndex        =   0
      Top             =   840
      Width           =   9855
      Begin VB.CommandButton cmdcontinuar 
         Caption         =   "&Continuar"
         Height          =   375
         Left            =   3960
         TabIndex        =   6
         Top             =   0
         Width           =   975
      End
      Begin VB.Image imgbola 
         Height          =   300
         Left            =   4560
         Picture         =   "frmjogo.frx":0442
         Stretch         =   -1  'True
         Top             =   2880
         Width           =   345
      End
      Begin VB.Image imgbarra2 
         Height          =   1245
         Left            =   8880
         Picture         =   "frmjogo.frx":0934
         Stretch         =   -1  'True
         Top             =   2400
         Width           =   240
      End
      Begin VB.Image imgbarra1 
         Height          =   1245
         Left            =   480
         Picture         =   "frmjogo.frx":143E
         Stretch         =   -1  'True
         Top             =   2640
         Width           =   240
      End
   End
   Begin MediaPlayerCtl.MediaPlayer MediaPlayer1 
      Height          =   375
      Left            =   10320
      TabIndex        =   11
      Top             =   4920
      Visible         =   0   'False
      Width           =   855
      AudioStream     =   -1
      AutoSize        =   0   'False
      AutoStart       =   -1  'True
      AnimationAtStart=   -1  'True
      AllowScan       =   -1  'True
      AllowChangeDisplaySize=   -1  'True
      AutoRewind      =   0   'False
      Balance         =   0
      BaseURL         =   ""
      BufferingTime   =   5
      CaptioningID    =   ""
      ClickToPlay     =   -1  'True
      CursorType      =   0
      CurrentPosition =   -1
      CurrentMarker   =   0
      DefaultFrame    =   ""
      DisplayBackColor=   0
      DisplayForeColor=   16777215
      DisplayMode     =   0
      DisplaySize     =   4
      Enabled         =   -1  'True
      EnableContextMenu=   -1  'True
      EnablePositionControls=   -1  'True
      EnableFullScreenControls=   0   'False
      EnableTracker   =   -1  'True
      Filename        =   ""
      InvokeURLs      =   -1  'True
      Language        =   -1
      Mute            =   0   'False
      PlayCount       =   1
      PreviewMode     =   0   'False
      Rate            =   1
      SAMILang        =   ""
      SAMIStyle       =   ""
      SAMIFileName    =   ""
      SelectionStart  =   -1
      SelectionEnd    =   -1
      SendOpenStateChangeEvents=   -1  'True
      SendWarningEvents=   -1  'True
      SendErrorEvents =   -1  'True
      SendKeyboardEvents=   0   'False
      SendMouseClickEvents=   0   'False
      SendMouseMoveEvents=   0   'False
      SendPlayStateChangeEvents=   -1  'True
      ShowCaptioning  =   0   'False
      ShowControls    =   -1  'True
      ShowAudioControls=   -1  'True
      ShowDisplay     =   0   'False
      ShowGotoBar     =   0   'False
      ShowPositionControls=   -1  'True
      ShowStatusBar   =   0   'False
      ShowTracker     =   -1  'True
      TransparentAtStart=   0   'False
      VideoBorderWidth=   0
      VideoBorderColor=   0
      VideoBorder3D   =   0   'False
      Volume          =   -600
      WindowlessVideo =   0   'False
   End
   Begin VB.Label lblteclas3 
      Caption         =   """A"" para cima e ""Z"" para baixo"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   10320
      TabIndex        =   10
      Top             =   3360
      Width           =   1575
   End
   Begin VB.Label lblteclas2 
      Caption         =   "As teclas do jogador 2, são:"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   10320
      TabIndex        =   9
      Top             =   2880
      Width           =   1695
   End
   Begin VB.Label lblteclas1 
      Caption         =   "As setas do cursor para cima e para baixo"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   10320
      TabIndex        =   8
      Top             =   1800
      Width           =   1695
   End
   Begin VB.Label lblteclas 
      Caption         =   "As teclas do jogador 1, são:"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   10320
      TabIndex        =   7
      Top             =   1320
      Width           =   1695
   End
   Begin VB.Label lblpontos 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   4680
      TabIndex        =   5
      Top             =   120
      Width           =   2055
   End
   Begin VB.Label lblresultado2 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   9600
      TabIndex        =   4
      Top             =   240
      Width           =   615
   End
   Begin VB.Label lblresultado1 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   2040
      TabIndex        =   3
      Top             =   240
      Width           =   495
   End
   Begin VB.Label lbljogador2 
      Caption         =   "Player2"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   8040
      TabIndex        =   2
      Top             =   240
      Width           =   1455
   End
   Begin VB.Label lbljogador1 
      Caption         =   "Player1"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   600
      TabIndex        =   1
      Top             =   240
      Width           =   1335
   End
End
Attribute VB_Name = "frmDiskFly"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim X, Y As String 'nome dos jogadores
Dim a, b As Integer 'resultado dos jogadores
Dim c, d As Integer 'Coordenadas da bola
Dim sair As Integer 'Saír do jogo
Private Function colisao(imgA As Image, imgb As Image) As Integer
    'Verificar se há colisão
    Dim a As trect
    Dim b As trect
    Dim resultrect As trect
    
    'Guarda a informação para a estrutura trect
    
    a.left = imgA.left
    a.top = imgA.top
    b.left = imgb.left
    b.top = imgb.top
    
    'Calcular o ponto direito e o inferior
    
    a.right = a.left + imgA.Width - 1
    a.bottom = a.top + imgA.Height - 1
    
    b.right = b.left + imgb.Width - 1
    b.bottom = b.top + imgb.Height - 1
    
    colisao = IntersectRect(resultrect, a, b)
End Function

Private Sub cmdcontinuar_Click()
    tmrbola.Enabled = True
    cmdcontinuar.Visible = False
    lblpontos.Visible = False
End Sub

Private Sub Form_Load()
    X = InputBox("Introduza o nome do jogador1", "Nome do jogador 1")
    Y = InputBox("Introduza o nome do jogador2", "Nome do jogador 2")
    If X = "" Then
        X = "Player 1"
    End If
    If Y = "" Then
        Y = "Player 2"
    End If
    lbljogador1.Caption = X
    lbljogador2.Caption = Y
    cmdcontinuar.Visible = True
    tmrbola.Enabled = False
    cmdcontinuar.Caption = "&Começar"
    lblpontos.Visible = False
    b = 0
    a = 0
    MediaPlayer1.Open (App.Path & "\trompete.wav")
End Sub

Private Sub Form_Unload(Cancel As Integer)
    Unload Me
    frmjogos.Show
End Sub

Private Sub Picture1_KeyDown(KeyCode As Integer, Shift As Integer)
    'Move a barra do jogador 1
    'Move a barra para cima
    If KeyCode = vbKeyUp Then
        imgbarra1.top = imgbarra1.top - 500
    'Move a barra para baixo
    ElseIf KeyCode = vbKeyDown Then
        imgbarra1.top = imgbarra1.top + 500
    End If
    'Move a barra do jogador 2
    'Move para cima
    If KeyCode = vbKeyA Then
        imgbarra2.top = imgbarra2.top - 500
    ElseIf KeyCode = vbKeyZ Then
        imgbarra2.top = imgbarra2.top + 500
    End If
End Sub

Private Sub tmrbola_Timer()
    'Move a bola
    Static subir As Boolean
    Static esquerda As Boolean
    
    If subir = True Then
        imgbola.top = imgbola.top - 200
        If imgbola.top <= 0 Then
            subir = False
            Exit Sub
        End If
        ElseIf subir = False Then
            imgbola.top = imgbola.top + 200
            If imgbola.top >= 6875 Then
                subir = True
                Exit Sub
            End If
        End If
    
    
    If esquerda = True Then
        imgbola.left = imgbola.left - 400
        If colisao(imgbola, imgbarra1) Then
            esquerda = False
            Exit Sub
        End If
    ElseIf esquerda = False Then
        imgbola.left = imgbola.left + 400
        If colisao(imgbola, imgbarra2) Then
            esquerda = True
            Exit Sub
        End If
    End If
    If imgbola.left >= 9855 Then
        MediaPlayer1.Open (App.Path & "\explusão.wav")
        a = a + 1
        lblresultado1.Caption = a
        lblpontos.Caption = "Ponto do " & X
        tmrbola.Enabled = False
        imgbola.top = 2880 'Topo da bola
        imgbola.left = 4560 'Margem Esquerda da bola
        cmdcontinuar.Visible = True
        cmdcontinuar.Caption = "&Continuar"
        lblpontos.Visible = True
    End If
    If imgbola.left <= 0 Then
        MediaPlayer1.Open (App.Path & "\explusão.wav")
        b = b + 1
        lblresultado2.Caption = b
        lblpontos.Caption = "Ponto do  " & Y
        tmrbola.Enabled = False
        imgbola.top = 2880
        imgbola.left = 4560
        cmdcontinuar.Visible = True
        cmdcontinuar.Caption = "&Continuar"
        lblpontos.Visible = True
    End If
    If b = 15 Then
        MsgBox "O vencedor é o " & Y, vbInformation, "Vencedor!"
        sair = MsgBox("Quer jogar outra vez?", vbYesNo + vbQuestion, "Game Over")
            If sair = vbYes Then
                a = 0
                b = 0
                lblpontos.Caption = ""
                lblresultado1.Caption = ""
                lblresultado2.Caption = ""
                imgbola.top = 2880
                imgbola.left = 4560
                cmdcontinuar.Visible = True
            
            Else
                Unload Me
            End If
        End If
    If a = 15 Then
        MsgBox "O vencedor é o " & X, vbInformation, "Vencedor!"
        sair = MsgBox("Quer jogar outra vez?", vbYesNo + vbQuestion, "Game Over")
        If sair = vbYes Then
            a = 0
            b = 0
            lblpontos.Caption = ""
            lblresultado1.Caption = ""
            lblresultado2.Caption = ""
            imgbola.top = 2880
            imgbola.left = 4560
            cmdcontinuar.Visible = True
        Else
            Unload Me
        End If
    End If
End Sub
