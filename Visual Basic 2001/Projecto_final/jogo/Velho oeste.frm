VERSION 5.00
Object = "{22D6F304-B0F6-11D0-94AB-0080C74C7E95}#1.0#0"; "msdxm.ocx"
Begin VB.Form frmvelho_oeste 
   Caption         =   "Velho Oeste"
   ClientHeight    =   6255
   ClientLeft      =   60
   ClientTop       =   345
   ClientWidth     =   6135
   Icon            =   "Velho oeste.frx":0000
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   6255
   ScaleWidth      =   6135
   StartUpPosition =   2  'CenterScreen
   Begin VB.Timer tmrbala2 
      Left            =   1920
      Top             =   3960
   End
   Begin VB.Timer tmrbala1 
      Left            =   1440
      Top             =   3960
   End
   Begin VB.Timer tmrcactos 
      Interval        =   5
      Left            =   960
      Top             =   3960
   End
   Begin VB.PictureBox picDeserto 
      Appearance      =   0  'Flat
      BackColor       =   &H00C0FFC0&
      ForeColor       =   &H80000008&
      Height          =   3315
      Left            =   120
      ScaleHeight     =   3285
      ScaleWidth      =   5745
      TabIndex        =   0
      Top             =   600
      Width           =   5775
      Begin VB.Image imgcato 
         Height          =   480
         Index           =   1
         Left            =   3120
         Picture         =   "Velho oeste.frx":0442
         Top             =   2520
         Width           =   480
      End
      Begin VB.Image imgcato 
         Height          =   480
         Index           =   0
         Left            =   1800
         Picture         =   "Velho oeste.frx":074C
         Top             =   600
         Width           =   480
      End
      Begin VB.Image imgbala2 
         Height          =   480
         Left            =   4560
         Picture         =   "Velho oeste.frx":0A56
         Top             =   1440
         Visible         =   0   'False
         Width           =   480
      End
      Begin VB.Image imgbala1 
         Height          =   480
         Left            =   240
         Picture         =   "Velho oeste.frx":0D60
         Top             =   1800
         Visible         =   0   'False
         Width           =   480
      End
      Begin VB.Image imgjogador2 
         Appearance      =   0  'Flat
         Height          =   480
         Left            =   5040
         Picture         =   "Velho oeste.frx":106A
         Top             =   240
         Width           =   480
      End
      Begin VB.Image imgJogador1 
         Appearance      =   0  'Flat
         Height          =   480
         Left            =   240
         Picture         =   "Velho oeste.frx":1374
         Top             =   2520
         Width           =   480
      End
   End
   Begin VB.Label lblvitoria2 
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
      Left            =   5520
      TabIndex        =   9
      Top             =   120
      Width           =   375
   End
   Begin VB.Label lblvitoria1 
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
      Left            =   1200
      TabIndex        =   8
      Top             =   120
      Width           =   255
   End
   Begin VB.Label lblteclas2 
      Caption         =   "Para mover o jogador2, use  o ""A"" para cima, o ""Z""para baixo e o ""x"" para disparar"
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
      Left            =   120
      TabIndex        =   7
      Top             =   5640
      Width           =   6015
   End
   Begin VB.Label lblTeclas1 
      Caption         =   "Para mover o jogador 1, use as setas para cima e para baixo. Use a tecla Shift para disparar"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   495
      Left            =   120
      TabIndex        =   6
      Top             =   5160
      Width           =   6015
   End
   Begin VB.Label lblInstruções 
      Caption         =   "Objectivo do jogo, é acertar no adversário, o 1º a morrer, perde."
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   255
      Left            =   120
      TabIndex        =   5
      Top             =   4800
      Width           =   5775
   End
   Begin VB.Label lblAutores 
      Caption         =   "Jogo feito por: António e Simão"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   255
      Left            =   120
      TabIndex        =   4
      Top             =   4560
      Width           =   3615
   End
   Begin VB.Image imgjogador4 
      Height          =   480
      Left            =   3480
      Picture         =   "Velho oeste.frx":167E
      Top             =   0
      Visible         =   0   'False
      Width           =   480
   End
   Begin VB.Image imgjogador3 
      Height          =   480
      Left            =   2040
      Picture         =   "Velho oeste.frx":1988
      Top             =   0
      Visible         =   0   'False
      Width           =   480
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
      Left            =   4320
      TabIndex        =   3
      Top             =   120
      Width           =   1095
   End
   Begin VB.Label lblJogador1 
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
      Left            =   240
      TabIndex        =   2
      Top             =   120
      Width           =   855
   End
   Begin MediaPlayerCtl.MediaPlayer MediaPlayer1 
      Height          =   1575
      Left            =   4080
      TabIndex        =   1
      Top             =   4080
      Visible         =   0   'False
      Width           =   2175
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
      Volume          =   0
      WindowlessVideo =   0   'False
   End
   Begin VB.Image imgfuneral 
      Height          =   480
      Left            =   120
      Picture         =   "Velho oeste.frx":1C92
      Top             =   3960
      Visible         =   0   'False
      Width           =   480
   End
End
Attribute VB_Name = "frmvelho_oeste"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim X, Y As String
Dim z As Integer
Dim a As Integer 'número de vitórias do jogador1
Dim b As Integer 'número de vitórias do jogador2

Private Function colisao(imgA As Image, imgb As Image) As Integer
    'Verifica se há  colisão entre duas imagens
    'Usando a função API
    
    Dim a As trect
    Dim b As trect
    Dim resultrect As trect
    
    'Guarda a informação para a estretura trect
    
        a.left = imgA.left
        a.top = imgA.top
        b.left = imgb.left
        b.top = imgb.top
        
        'calcular o ponto direito e o inferior
        'São precisos para a função API
        a.right = a.left + imgA.Width - 1
        a.bottom = a.top + imgA.Height - 1
        
        b.right = b.left + imgb.Width - 1
        b.bottom = b.top + imgb.Height - 1
        
        'IntersectRect só retornará o valo 0 se
        'as duas imagens não chocarem entre si
        colisao = IntersectRect(resultrect, a, b)
        
End Function

Private Sub Form_Load()
    X = InputBox("Introduza o nome do player1", "Player 1")
    Y = InputBox("Introduza o nome do player2", "Player 2")
    If X = "" Then
        X = "Player 1"
    End If
    If Y = "" Then
        Y = "player 2"
    End If
    lbljogador1.Caption = X
    lbljogador2.Caption = Y
    a = 0
    b = 0
    End Sub

Private Sub Form_MouseMove(Button As Integer, Shift As Integer, X As Single, Y As Single)
    lblteclas1.ForeColor = &H80000012
    lblteclas2.ForeColor = &H80000012
End Sub

Private Sub Form_Unload(Cancel As Integer)
    Unload Me
    frmjogos.Show
End Sub

Private Sub lblInstruções_MouseMove(Button As Integer, Shift As Integer, X As Single, Y As Single)
    lblteclas1.ForeColor = &H80000012
    lblteclas2.ForeColor = &H80000012
End Sub

Private Sub lblTeclas1_MouseMove(Button As Integer, Shift As Integer, X As Single, Y As Single)
    lblteclas1.ForeColor = &HFF00&
    lblteclas2.ForeColor = &HFF00&
End Sub

Private Sub lblteclas2_Click()
    lblteclas1.ForeColor = &HFF00&
    lblteclas2.ForeColor = &HFF00&
End Sub

Private Sub picDeserto_KeyDown(KeyCode As Integer, Shift As Integer)
    'Permite ao jogador1 deslocar-se para cima
    If KeyCode = vbKeyUp Then
        imgJogador1.top = imgJogador1.top - 100
        
    'Permite ao jogador2 deslocar-se para baixo
    ElseIf KeyCode = vbKeyDown Then
        imgJogador1.top = imgJogador1.top + 100
        
    'Permite ao jogador 1 disparar
    ElseIf KeyCode = vbKeyShift Then
        MediaPlayer1.Open (App.Path & "\bang.wav")
            imgbala1.top = imgJogador1.top
            imgbala1.left = imgJogador1.left + 640 'Para a bala saír da arma
            tmrbala1.Interval = 50
            tmrbala1.Enabled = True
            imgbala1.Visible = True
            
            
       End If
    'Permite ao jogador2 deslocar-se para cima
    If KeyCode = vbKeyA Then
        imgjogador2.top = imgjogador2.top - 100
    ElseIf KeyCode = vbKeyZ Then
        imgjogador2.top = imgjogador2.top + 100
        
    'permite ao jogador2 deslocar-se para baixo
    ElseIf KeyCode = vbKeyZ Then
        imgjogador2.top = imgjogador2.top + 100
        
    'Permite ao jogador 2 disparar
    ElseIf KeyCode = vbKeyX Then
        MediaPlayer1.Open (App.Path & "\gunfire2.wav")
        imgbala2.top = imgjogador2.top
        imgbala2.left = imgjogador2.left - 640 'Para a bala saír da arma
        tmrbala2.Interval = 50
        tmrbala2.Enabled = True
        imgbala2.Visible = True
  End If
  

End Sub
Private Sub tmrbala1_Timer()
    
    'Movimeto da bala do jogador1
    
        If imgbala1.left >= Me.ScaleWidth Then
            tmrbala1.Interval = 0
        End If
    imgbala1.left = imgbala1.left + 500
    
      If colisao(imgbala1, imgcato(0)) Then
            imgbala1.Visible = False
        End If
        'Verificar se a bala do jogador 1
        'Atingiu o jogador2
        'Se atingiu Imprime uma mensagem a dizer quem ganhou
        
      If colisao(imgbala1, imgjogador2) Then
        MediaPlayer1.Open (App.Path & "\oh!!.wav")
        tmrbala2.Enabled = False
        imgbala2.Visible = False
        imgbala1.Visible = False
        imgjogador2.Picture = imgfuneral.Picture
        tmrbala1.Enabled = False
        a = a + 1
        lblvitoria1.Caption = a
        MsgBox X & " Ganhou!", vbExclamation, "Game Over"
        z = MsgBox("Quer jogar outra vez?", vbYesNo + vbQuestion, "Game Over")
        If z = 6 Then
            imgJogador1.top = 2520
            imgjogador2.top = 240
            imgcato(0).top = 600
            imgcato(1).top = 2520
            imgjogador2.Picture = imgjogador3.Picture
           
        Else
            Unload Me
            frmjogos.Show
        End If
    End If
    
        'Verificar se a bala do jogador1
        'Atingiu o cato
        If colisao(imgbala1, imgcato(0)) Then
            imgbala1.Visible = False
            tmrbala1.Interval = 0
        End If
        If colisao(imgbala1, imgcato(1)) Then
            imgbala1.Visible = False
            tmrbala1.Interval = 0
        End If
End Sub

Private Sub tmrbala2_Timer()
    'Movimento da bala do jogador2
    
     If imgbala2.left >= Me.ScaleWidth Then
        tmrbala2.Interval = 0
    End If
    imgbala2.left = imgbala2.left - 500
    
    'Verifica se a bala atingiu o jogador 1
    'Caso isso se verifique imprime uma mensagem
    'A dizer quem ganhou
    
    If colisao(imgbala2, imgJogador1) Then
        MediaPlayer1.Open (App.Path & "\oh!!.wav")
        imgbala1.Visible = False
        tmrbala1.Enabled = False
        imgbala2.Visible = False
        imgJogador1.Picture = imgfuneral.Picture
        tmrbala2.Enabled = False
        b = b + 1
        lblvitoria2.Caption = b
        MsgBox Y & " Ganhou!", vbExclamation, "Game Over"
        z = MsgBox("Quer jogar outra vez?", vbYesNo + vbQuestion, "Game Over")
        If z = 6 Then
            imgJogador1.top = 2520
            imgjogador2.top = 240
            imgcato(0).top = 600
            imgcato(1).top = 2520
            imgJogador1.Picture = imgjogador4.Picture
        Else
            Unload Me
            frmjogos.Show
        End If
    End If
    
    'Verifica se a bala do player2 atingiu algum cato
        If colisao(imgbala2, imgcato(0)) Then
            imgbala2.Visible = False
            tmrbala2.Enabled = False
        End If
        If colisao(imgbala2, imgcato(1)) Then
            imgbala2.Visible = False
            tmrbala2.Enabled = False
        End If
End Sub

Private Sub tmrcactos_Timer()
    Const cactos_inc = 30
    Const num_cacto = 2
    
    Dim i As Integer
    Dim rc As Integer
    
    'Move os cactos
    For i = 0 To num_cacto - 1
        imgcato(i).top = imgcato(i).top - cactos_inc
        If imgcato(i).top < -imgcato(i).Height Then
            imgcato(i).top = picDeserto.Height
        End If
    Next
End Sub
