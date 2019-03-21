VERSION 5.00
Object = "{22D6F304-B0F6-11D0-94AB-0080C74C7E95}#1.0#0"; "msdxm.ocx"
Begin VB.Form frmArkanoyd 
   BackColor       =   &H0000FF00&
   BorderStyle     =   0  'None
   Caption         =   "Arkanoyd"
   ClientHeight    =   8025
   ClientLeft      =   1785
   ClientTop       =   735
   ClientWidth     =   7950
   Icon            =   "frmjogo.frx":0000
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   8025
   ScaleWidth      =   7950
   ShowInTaskbar   =   0   'False
   StartUpPosition =   2  'CenterScreen
   Begin VB.Timer Timerbola 
      Enabled         =   0   'False
      Interval        =   100
      Left            =   6120
      Top             =   0
   End
   Begin MediaPlayerCtl.MediaPlayer MediaPlayer2 
      Height          =   615
      Left            =   6480
      TabIndex        =   5
      Top             =   4080
      Visible         =   0   'False
      Width           =   975
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
   Begin MediaPlayerCtl.MediaPlayer MediaPlayer1 
      Height          =   615
      Left            =   6480
      TabIndex        =   4
      Top             =   3120
      Visible         =   0   'False
      Width           =   975
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
   Begin VB.Label lblpontos 
      BackColor       =   &H0000FF00&
      Height          =   375
      Left            =   960
      TabIndex        =   3
      Top             =   7440
      Width           =   495
   End
   Begin VB.Label lblresultado 
      BackColor       =   &H0000FF00&
      Caption         =   "Pontos:"
      Height          =   255
      Left            =   360
      TabIndex        =   2
      Top             =   7440
      Width           =   615
   End
   Begin VB.Label lblnivel 
      Alignment       =   2  'Center
      BackColor       =   &H0000FF00&
      Caption         =   "Niveis:"
      BeginProperty Font 
         Name            =   "Small Fonts"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   240
      TabIndex        =   1
      Top             =   6840
      Width           =   1215
   End
   Begin VB.Image imgsorri 
      Height          =   960
      Left            =   5520
      Picture         =   "frmjogo.frx":0442
      Top             =   6840
      Visible         =   0   'False
      Width           =   960
   End
   Begin VB.Image imgbola8 
      Height          =   960
      Left            =   4320
      Picture         =   "frmjogo.frx":1886
      Top             =   6840
      Visible         =   0   'False
      Width           =   960
   End
   Begin VB.Image imgv 
      Height          =   960
      Left            =   6720
      Picture         =   "frmjogo.frx":2CCA
      Top             =   6840
      Visible         =   0   'False
      Width           =   960
   End
   Begin VB.Image imgcampo 
      Height          =   960
      Left            =   3120
      Picture         =   "frmjogo.frx":410E
      Top             =   6840
      Visible         =   0   'False
      Width           =   960
   End
   Begin VB.Image imggalinha 
      Height          =   960
      Left            =   1920
      Picture         =   "frmjogo.frx":5552
      Top             =   6840
      Visible         =   0   'False
      Width           =   960
   End
   Begin VB.Line Line1 
      X1              =   120
      X2              =   7800
      Y1              =   6480
      Y2              =   6480
   End
   Begin VB.Image imgbola 
      Height          =   300
      Left            =   4200
      Picture         =   "frmjogo.frx":6996
      Top             =   4250
      Width           =   300
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H0000FF00&
      Caption         =   "Arkanoyd"
      BeginProperty Font 
         Name            =   "Small Fonts"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H0000FFFF&
      Height          =   495
      Left            =   2280
      TabIndex        =   0
      Top             =   480
      Width           =   3375
   End
   Begin VB.Image imgbarra 
      Height          =   390
      Left            =   3480
      Picture         =   "frmjogo.frx":6E88
      Top             =   4440
      Width           =   1410
   End
   Begin VB.Menu mnuopções 
      Caption         =   "Opções"
      Begin VB.Menu mnunovo 
         Caption         =   "Novo &jogo"
      End
      Begin VB.Menu mnuniveis 
         Caption         =   "&Niveis"
         Begin VB.Menu mnunivel1 
            Caption         =   "Nivel 1"
         End
         Begin VB.Menu mnunivel2 
            Caption         =   "Nivel 2"
         End
         Begin VB.Menu mnunivel3 
            Caption         =   "Nivel 3"
         End
         Begin VB.Menu mnunivel4 
            Caption         =   "Nivel 4"
         End
      End
   End
End
Attribute VB_Name = "frmArkanoyd"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim a As Variant 'para contar quando bata no top=0
Dim sair As Integer

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
Private Sub Form_KeyDown(KeyCode As Integer, Shift As Integer)

'movimenta a barra para a direita ou para a esquerda

If KeyCode = vbKeyRight Then
    imgbarra.left = imgbarra.left + 400
ElseIf KeyCode = vbKeyLeft Then
    imgbarra.left = imgbarra.left - 400
ElseIf KeyCode = vbKeySpace Then
    Timerbola.Enabled = True
End If
If Timerbola.Enabled = False And KeyCode = vbKeyRight Then
    imgbola.left = imgbola.left + 400
ElseIf Timerbola.Enabled = False And KeyCode = vbKeyLeft Then
    imgbola.left = imgbola.left - 400
End If
        
End Sub

Private Sub Form_Resize()
'não permite aumentar ou diminuir o tamanho do formolario
If Me.WindowState <> 1 Then
Me.Width = 8040
Me.Height = 8545
End If
End Sub

Private Sub Form_Unload(Cancel As Integer)
  Unload frmArkanoyd
  frmjogos.Show
End Sub

Private Sub mnunivel1_Click()
'coloca a andar com a velocidade respectiva ao 1º nivel
If mnunivel1.Checked = False Then
    mnunivel1.Checked = True
    mnunivel2.Checked = False
    mnunivel3.Checked = False
    mnunivel4.Checked = False
End If
Timerbola.Interval = 100
End Sub

Private Sub mnunivel2_Click()
'coloca a andar com a velocidade respectiva ao 2º nivel
If mnunivel2.Checked = False Then
    mnunivel2.Checked = True
    mnunivel1.Checked = False
    mnunivel3.Checked = False
    mnunivel4.Checked = False
End If
Timerbola.Interval = 50
End Sub
Private Sub mnunivel3_Click()
'coloca a andar com a velocidade respectiva ao 3º nivel
If mnunivel3.Checked = False Then
    mnunivel3.Checked = True
    mnunivel2.Checked = False
    mnunivel1.Checked = False
    mnunivel4.Checked = False
End If

Timerbola.Interval = 25
End Sub

Private Sub mnunivel4_Click()
'coloca a andar com a velocidade respectiva ao 4º nivel
If mnunivel4.Checked = True Then
    mnunivel4.Checked = True
    mnunivel2.Checked = True
    mnunivel1.Checked = False
    mnunivel3.Checked = False
End If

Timerbola.Interval = 10
End Sub

Private Sub mnunovo_Click()
'coloca a bola na posição inicial
imgbola.top = 600
imgbola.left = 7780
'coloca a barra na posição inicial
imgbarra.top = 4440
imgbarra.left = 3120
Timerbola.Enabled = True
End Sub

Private Sub Timerbola_Timer()
'################################# MOVE A BOLA #####################################
'o ponto (0,0) está no ponto esquerdo do form "jogo"
Static subir As Boolean
Static movesc As Boolean

   If movesc = True Then
        imgbola.left = imgbola.left - 100
        If imgbola.left <= 0 Then
            movesc = False
            Exit Sub
        End If
    ElseIf movesc = False Then
        imgbola.left = imgbola.left + 100
        If imgbola.left >= 7675 Then
            movesc = True
            Exit Sub
        End If
    End If
    
    If imgbola.top >= 6280 Then
    MediaPlayer1.Open (App.Path & "\explusão.wav")
    sair = MsgBox("Perdeu o jogo com " & a & " pontos! Deseja Continuar?", vbYesNo, "Game over")
        If sair = vbYes Then
            'coloca a bola na posição inicial
            imgbola.top = 600
            imgbola.left = 7780
            'coloca a barra na posição inicial
            imgbarra.top = 4440
            imgbarra.left = 3120
            Timerbola.Enabled = True
        End If
        If sair = vbNo Then
           Unload Me
        End If
     End If
    If subir = True Then
        imgbola.top = imgbola.top - 100
        If imgbola.top <= 0 Then
        a = a + 1                      '| conta quando embate no
        lblpontos.Caption = a          '| top do form
          subir = False
          Exit Sub
        End If
    ElseIf subir = False Then
        imgbola.top = imgbola.top + 100
        If colisao(imgbola, imgbarra) Then
            subir = True
            Exit Sub
        End If
   End If
    ' mostra as imagens quando chegam aos pontos respectivos
   If (a = 100) Then
    imggalinha.Visible = True
   ElseIf (a = 200) Then
    imggalinha.Visible = True
    imgcampo.Visible = True
   ElseIf (a = 300) Then
    imggalinha.Visible = True
    imgcampo.Visible = True
    imgbola8.Visible = True
   ElseIf (a = 400) Then
    imggalinha.Visible = True
    imgcampo.Visible = True
    imgbola8.Visible = True
    imgsorri.Visible = True
   ElseIf (a = 500) Then
    imggalinha.Visible = True
    imgcampo.Visible = True
    imgbola8.Visible = True
    imgsorri.Visible = True
    imgv.Visible = True
   End If
   
   If (a = 550) Then
    sair = MsgBox("Parabens, Ganhou o jogo!", vbInformation + vbOKOnly, "Arkanoyd")
        If sair = vbOK Then
            Unload Me
        End If
   End If
  '########################### FIM DO CODIGO PARA MOVER A BOLA ######################
  End Sub

             
