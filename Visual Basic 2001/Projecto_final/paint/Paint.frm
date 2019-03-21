VERSION 5.00
Object = "{F9043C88-F6F2-101A-A3C9-08002B2F49FB}#1.2#0"; "COMDLG32.ocx"
Begin VB.Form frmDesenho 
   Caption         =   "Desenho"
   ClientHeight    =   7680
   ClientLeft      =   165
   ClientTop       =   450
   ClientWidth     =   10710
   Icon            =   "Paint.frx":0000
   LinkTopic       =   "Form1"
   MouseIcon       =   "Paint.frx":0442
   MousePointer    =   2  'Cross
   ScaleHeight     =   3945
   ScaleMode       =   0  'User
   ScaleWidth      =   10710
   StartUpPosition =   2  'CenterScreen
   WindowState     =   2  'Maximized
   Begin VB.PictureBox Picture6 
      AutoSize        =   -1  'True
      BorderStyle     =   0  'None
      Height          =   300
      Left            =   7440
      Picture         =   "Paint.frx":0884
      ScaleHeight     =   300
      ScaleWidth      =   555
      TabIndex        =   40
      Top             =   3720
      Visible         =   0   'False
      Width           =   555
   End
   Begin VB.PictureBox Picture5 
      AutoSize        =   -1  'True
      BorderStyle     =   0  'None
      Height          =   270
      Left            =   7440
      Picture         =   "Paint.frx":1186
      ScaleHeight     =   270
      ScaleWidth      =   540
      TabIndex        =   39
      Top             =   1800
      Visible         =   0   'False
      Width           =   540
   End
   Begin VB.PictureBox Picture4 
      AutoSize        =   -1  'True
      BorderStyle     =   0  'None
      Height          =   255
      Left            =   7440
      Picture         =   "Paint.frx":1960
      ScaleHeight     =   255
      ScaleWidth      =   540
      TabIndex        =   38
      Top             =   2160
      Visible         =   0   'False
      Width           =   540
   End
   Begin VB.PictureBox Picture3 
      AutoSize        =   -1  'True
      BorderStyle     =   0  'None
      Height          =   285
      Left            =   7440
      Picture         =   "Paint.frx":20CE
      ScaleHeight     =   285
      ScaleWidth      =   555
      TabIndex        =   37
      Top             =   3360
      Visible         =   0   'False
      Width           =   555
   End
   Begin VB.PictureBox Picture2 
      AutoSize        =   -1  'True
      BorderStyle     =   0  'None
      Height          =   270
      Left            =   7440
      Picture         =   "Paint.frx":2960
      ScaleHeight     =   270
      ScaleWidth      =   525
      TabIndex        =   33
      Top             =   2520
      Visible         =   0   'False
      Width           =   525
   End
   Begin VB.PictureBox Picscl 
      AutoSize        =   -1  'True
      BorderStyle     =   0  'None
      Height          =   300
      Left            =   7440
      Picture         =   "Paint.frx":313A
      ScaleHeight     =   300
      ScaleWidth      =   555
      TabIndex        =   32
      Top             =   2880
      Visible         =   0   'False
      Width           =   555
   End
   Begin MSComDlg.CommonDialog cdlImagem 
      Left            =   7200
      Top             =   480
      _ExtentX        =   847
      _ExtentY        =   847
      _Version        =   393216
   End
   Begin VB.PictureBox Picture1 
      Appearance      =   0  'Flat
      BackColor       =   &H80000007&
      ForeColor       =   &H80000008&
      Height          =   3975
      Left            =   1800
      MousePointer    =   99  'Custom
      ScaleHeight     =   6000
      ScaleMode       =   0  'User
      ScaleWidth      =   5265
      TabIndex        =   2
      Top             =   120
      Width           =   5295
   End
   Begin VB.Frame Fracores 
      Height          =   615
      Left            =   120
      MousePointer    =   1  'Arrow
      TabIndex        =   1
      Top             =   6960
      Width           =   6015
      Begin VB.PictureBox piccoractiva 
         BackColor       =   &H80000006&
         Height          =   255
         Left            =   120
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   25
         Top             =   120
         Width           =   255
      End
      Begin VB.PictureBox Picfundo 
         BackColor       =   &H80000007&
         Height          =   255
         Left            =   240
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   24
         Top             =   240
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   15
         Left            =   2280
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   23
         Top             =   360
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   14
         Left            =   2280
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   22
         Top             =   120
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   13
         Left            =   2040
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   21
         Top             =   360
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   12
         Left            =   2040
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   20
         Top             =   120
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   11
         Left            =   1800
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   19
         Top             =   360
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   10
         Left            =   1800
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   18
         Top             =   120
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   9
         Left            =   1560
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   17
         Top             =   360
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   8
         Left            =   1560
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   16
         Top             =   120
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   7
         Left            =   1320
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   15
         Top             =   360
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   6
         Left            =   1320
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   14
         Top             =   120
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   5
         Left            =   1080
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   13
         Top             =   360
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   4
         Left            =   1080
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   12
         Top             =   120
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   3
         Left            =   840
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   11
         Top             =   360
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   2
         Left            =   840
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   10
         Top             =   120
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   1
         Left            =   600
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   9
         Top             =   360
         Width           =   255
      End
      Begin VB.PictureBox Piccor 
         BackColor       =   &H80000009&
         Height          =   255
         Index           =   0
         Left            =   600
         ScaleHeight     =   195
         ScaleWidth      =   195
         TabIndex        =   8
         Top             =   120
         Width           =   255
      End
   End
   Begin VB.Frame Fraferramentas 
      BackColor       =   &H80000013&
      Height          =   7095
      Left            =   120
      MousePointer    =   1  'Arrow
      TabIndex        =   0
      Top             =   0
      Width           =   1575
      Begin VB.CommandButton cmdRaios 
         Height          =   375
         Left            =   720
         Picture         =   "Paint.frx":3A3C
         Style           =   1  'Graphical
         TabIndex        =   42
         Top             =   1200
         Width           =   495
      End
      Begin VB.CommandButton cmdSarrabiscos 
         Height          =   375
         Left            =   240
         Picture         =   "Paint.frx":406E
         Style           =   1  'Graphical
         TabIndex        =   41
         Top             =   1200
         Width           =   495
      End
      Begin VB.Frame FraFundo 
         BackColor       =   &H80000013&
         BorderStyle     =   0  'None
         Height          =   1335
         Left            =   240
         TabIndex        =   31
         Top             =   2040
         Visible         =   0   'False
         Width           =   975
         Begin VB.PictureBox Piccf 
            AutoSize        =   -1  'True
            BorderStyle     =   0  'None
            Height          =   300
            Left            =   240
            Picture         =   "Paint.frx":4740
            ScaleHeight     =   300
            ScaleWidth      =   555
            TabIndex        =   36
            Top             =   120
            Width           =   555
         End
         Begin VB.PictureBox Piccl 
            AutoSize        =   -1  'True
            BorderStyle     =   0  'None
            Height          =   255
            Left            =   240
            Picture         =   "Paint.frx":5042
            ScaleHeight     =   255
            ScaleWidth      =   540
            TabIndex        =   35
            Top             =   480
            Width           =   540
         End
         Begin VB.PictureBox Picsf 
            AutoSize        =   -1  'True
            BorderStyle     =   0  'None
            Height          =   270
            Left            =   240
            Picture         =   "Paint.frx":57B0
            ScaleHeight     =   270
            ScaleWidth      =   540
            TabIndex        =   34
            Top             =   840
            Width           =   540
         End
      End
      Begin VB.CommandButton Cmdborracha 
         Height          =   375
         Left            =   720
         Picture         =   "Paint.frx":5F8A
         Style           =   1  'Graphical
         TabIndex        =   27
         Top             =   480
         Width           =   495
      End
      Begin VB.TextBox txtespessura 
         Height          =   285
         Left            =   120
         TabIndex        =   26
         Text            =   "1"
         Top             =   4440
         Width           =   1095
      End
      Begin VB.CommandButton CmdTexto 
         Height          =   375
         Left            =   720
         Picture         =   "Paint.frx":6526
         Style           =   1  'Graphical
         TabIndex        =   7
         Top             =   1560
         Width           =   495
      End
      Begin VB.CommandButton CmdCirculo 
         Height          =   375
         Left            =   240
         Picture         =   "Paint.frx":6830
         Style           =   1  'Graphical
         TabIndex        =   6
         Top             =   1560
         Width           =   495
      End
      Begin VB.CommandButton cmdRectangulo 
         Height          =   375
         Left            =   720
         Picture         =   "Paint.frx":6DCC
         Style           =   1  'Graphical
         TabIndex        =   5
         Top             =   840
         Width           =   495
      End
      Begin VB.CommandButton cmdlinha 
         Height          =   375
         Left            =   240
         Picture         =   "Paint.frx":7368
         Style           =   1  'Graphical
         TabIndex        =   4
         Top             =   840
         Width           =   495
      End
      Begin VB.CommandButton cmdlapis 
         Height          =   375
         Left            =   240
         MouseIcon       =   "Paint.frx":7904
         Picture         =   "Paint.frx":7D46
         Style           =   1  'Graphical
         TabIndex        =   3
         Top             =   480
         Width           =   495
      End
      Begin VB.Label lblcoordenadas2 
         BackColor       =   &H80000013&
         Caption         =   "Coordenadas:"
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
         TabIndex        =   30
         Top             =   5400
         Visible         =   0   'False
         Width           =   1215
      End
      Begin VB.Label lblcordenadas 
         BackColor       =   &H80000013&
         Height          =   615
         Left            =   90
         TabIndex        =   29
         Top             =   5760
         Visible         =   0   'False
         Width           =   1455
      End
      Begin VB.Label lblespessura 
         BackColor       =   &H80000013&
         Caption         =   "Espessura:"
         BeginProperty Font 
            Name            =   "MS Sans Serif"
            Size            =   9.75
            Charset         =   0
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   255
         Left            =   120
         TabIndex        =   28
         Top             =   3960
         Width           =   1185
      End
   End
   Begin VB.Menu mnuficheiro 
      Caption         =   "&Ficheiro"
      Begin VB.Menu mnunovo 
         Caption         =   "&Novo"
         Shortcut        =   ^O
      End
      Begin VB.Menu mnuabrir 
         Caption         =   "&Abrir"
         Shortcut        =   ^N
      End
      Begin VB.Menu mnuguardar 
         Caption         =   "&Guardar Imagem"
         Shortcut        =   ^S
      End
      Begin VB.Menu mnuLinha9 
         Caption         =   "-"
      End
      Begin VB.Menu mnusair 
         Caption         =   "&Saír"
      End
   End
   Begin VB.Menu mnuver 
      Caption         =   "&Ver"
      Begin VB.Menu mnuferramentas 
         Caption         =   "&Barra de Ferramentas"
         Checked         =   -1  'True
      End
      Begin VB.Menu mnubcores 
         Caption         =   "B&arra de cores"
         Checked         =   -1  'True
      End
      Begin VB.Menu mnucordenadas 
         Caption         =   "Barra de &Coordenadas"
      End
   End
   Begin VB.Menu mnucores 
      Caption         =   "&Cores"
      Begin VB.Menu mnueditarcores 
         Caption         =   "&Editar cor activa..."
      End
      Begin VB.Menu mnucorfundo 
         Caption         =   "E&ditar cor fundo..."
      End
   End
   Begin VB.Menu mnuformatar 
      Caption         =   "&Formatar"
      Begin VB.Menu mnudesenho 
         Caption         =   "&Lápis"
      End
      Begin VB.Menu mnuborracha 
         Caption         =   "&borracha"
      End
      Begin VB.Menu mnuLinha 
         Caption         =   "&Linha"
         Checked         =   -1  'True
      End
      Begin VB.Menu mnuraios 
         Caption         =   "R&aios"
      End
      Begin VB.Menu mnusarrabiscos 
         Caption         =   "&Sarrabiscos"
      End
      Begin VB.Menu mnurectangulo 
         Caption         =   "&Rectângulo"
      End
      Begin VB.Menu mnuCirculo 
         Caption         =   "&Circulo"
      End
      Begin VB.Menu mnuTexto 
         Caption         =   "&Texto"
      End
      Begin VB.Menu mnuseparador 
         Caption         =   "-"
      End
      Begin VB.Menu mnuformatartext 
         Caption         =   "&Formatar Texto"
      End
      Begin VB.Menu mnuseparador2 
         Caption         =   "-"
      End
      Begin VB.Menu mnuLimpar 
         Caption         =   "&Limpar"
      End
   End
End
Attribute VB_Name = "frmDesenho"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Public n As Byte            'Contador
Public cor As Long          'cor activa
Public corfundo As Long     'Cor fundo
Public Xinicial As Single   'X Inicial
Public Yinicial As Single   'Y Inicial
Public Xfinal As Single     'X final
Public Yfinal As Single     'Y Final
Public z As Integer         'Espessura das linhas
Public f As Integer         'Preenchimento do rectangulo
Public d As Integer         'Tipo de linha
Public poligono, poligonox, poligonoy
Dim NomeDoArquivo
Private Sub Cmdborracha_Click()
    MouseIcon = LoadPicture(App.Path & "\erase01.ico")
    MousePointer = 99
    mnudesenho.Checked = False
    mnuborracha.Checked = True
    mnulinha.Checked = False
    mnurectangulo.Checked = False
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
    mnuraios.Checked = False
    mnusarrabiscos.Checked = False
    txtespessura.Visible = False
    lblespessura.Visible = False
    FraFundo.Visible = False
End Sub


Private Sub CmdCirculo_Click()
    'Comando Círculo
    'Definir os vistos e o ponteiro
    
    MousePointer = 2
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = False
    mnurectangulo.Checked = False
    mnuCirculo.Checked = True
    mnuTexto.Checked = False
     mnuraios.Checked = False
    mnusarrabiscos.Checked = False
    txtespessura.Visible = False
    lblespessura.Visible = False
    FraFundo.Visible = True
End Sub

Private Sub cmdlapis_Click()
    'Comando lápis
    MouseIcon = LoadPicture(App.Path & "\pencil01.ico")
    MousePointer = 99
    mnudesenho.Checked = True
    mnuborracha.Checked = False
    mnulinha.Checked = False
    mnurectangulo.Checked = False
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
     mnuraios.Checked = False
    mnusarrabiscos.Checked = False
    txtespessura.Visible = False
    lblespessura.Visible = False
    FraFundo.Visible = False
    
End Sub

Private Sub cmdlinha_Click()
    'Comando Linha
    
    MousePointer = 2
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = True
    mnurectangulo.Checked = False
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
    mnuraios.Checked = False
    mnusarrabiscos.Checked = False
    txtespessura.Visible = True
    lblespessura.Visible = True
    FraFundo.Visible = False
End Sub

Private Sub cmdRaios_Click()
    MousePointer = 2
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = False
    mnurectangulo.Checked = True
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
    mnuraios.Checked = True
    mnusarrabiscos.Checked = False
    txtespessura.Visible = False
    lblespessura.Visible = False
    FraFundo.Visible = False
End Sub

Private Sub cmdRectangulo_Click()
    'comando rectangulo
    
    MousePointer = 2
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = False
    mnurectangulo.Checked = True
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
     mnuraios.Checked = False
    mnusarrabiscos.Checked = False
    txtespessura.Visible = False
    lblespessura.Visible = False
    FraFundo.Visible = True
    
End Sub
Private Sub cmdSarrabiscos_Click()
    MousePointer = 2
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = True
    mnurectangulo.Checked = False
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
    mnuraios.Checked = False
    mnusarrabiscos.Checked = True
    txtespessura.Visible = True
    lblespessura.Visible = True
    FraFundo.Visible = False
End Sub

Private Sub CmdTexto_Click()
    'Comando Texto
    
    MousePointer = 3
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = False
    mnurectangulo.Checked = False
    mnuCirculo.Checked = False
    mnuTexto.Checked = True
     mnuraios.Checked = False
    mnusarrabiscos.Checked = False
    txtespessura.Visible = False
    lblespessura.Visible = False
    FraFundo.Visible = False
End Sub

Private Sub Form_Load()
    'Definir as cores da barra de cores
    For n = 0 To 15
        Piccor(n).BackColor = QBColor(n)
    Next n
    cor = 0

End Sub
Private Sub Form_Resize()
    'Redimensionar a picturebox onde se desenha
    
     Fracores.top = Me.ScaleHeight - 650
     Fracores.Width = Me.ScaleWidth - 100
     Picture1.Width = Me.ScaleWidth - Picture1.left - 100
     Picture1.Height = Me.ScaleHeight - Picture1.top - 700
   End Sub

Private Sub Form_Unload(Cancel As Integer)
    Dim sair
    sair = MsgBox("Deseja guardar a imagem antes de saír?", vbYesNoCancel + vbQuestion, "Saír")
    If sair = vbYes Then
        mnuguardar_Click
        End
    ElseIf sair = vbNo Then
        Unload Me
        frmprincipal.Show
    ElseIf sair = vbCancel Then
        Cancel = True
    End If
End Sub

Private Sub mnuabrir_Click()
    'Abrir uma imagem em formato BMP, JPG ou GIF
    
    cdlImagem.DialogTitle = "Abrir Imagem"
    cdlImagem.Filter = "Bitmaps (*.BMP)|*.BMP|JPG(*.jpg)|*.JPG|Gif(*.Gif)|*.Gif"
    cdlImagem.Flags = cdlOFNHideReadOnly
    cdlImagem.ShowOpen
    Picture1.Picture = LoadPicture(cdlImagem.FileName, , , 1500, 0)
    
End Sub

Private Sub mnubcores_Click()
    'Põe no modo visivel ou invisivel a barras de cores
    
    If mnubcores.Checked = False Then
        mnubcores.Checked = True
        Fracores.Visible = True
    Else
        mnubcores.Checked = False
        Fracores.Visible = False
    End If
End Sub

Private Sub mnuborracha_Click()
    mnudesenho.Checked = False
    mnuborracha.Checked = True
    mnulinha.Checked = False
    mnurectangulo.Checked = False
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
    mnuraios.Checked = False
    mnusarrabiscos.Checked = False
    
End Sub

Private Sub mnuCirculo_Click()
    'Definir o menu círculo
    
    MousePointer = 2
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = False
    mnurectangulo.Checked = False
    mnuCirculo.Checked = True
    mnuTexto.Checked = False
    mnuraios.Checked = False
    mnusarrabiscos.Checked = False
End Sub

Private Sub mnucordenadas_Click()
    If lblcordenadas.Visible = False Then
        lblcoordenadas2.Visible = True
        lblcordenadas.Visible = True
        mnucordenadas.Checked = True
    Else
        lblcordenadas.Visible = False
        mnucordenadas.Checked = False
        lblcoordenadas2.Visible = False
    End If
End Sub

Private Sub mnucorfundo_Click()
    'Editar cor de fundo
    cdlImagem.DialogTitle = "Seleccione uma cor:"
    cdlImagem.ShowColor
    corfundo = cdlImagem.Color
    Picture1.BackColor = corfundo
    Picfundo.BackColor = corfundo
End Sub
Private Sub mnudesenho_Click()
    'Definir o menu de desenho livre(Lápis)
    
    MousePointer = 99
    mnudesenho.Checked = True
    mnuborracha.Checked = False
    mnulinha.Checked = False
    mnurectangulo.Checked = False
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
    mnuraios.Checked = False
    mnusarrabiscos.Checked = False
   
End Sub

Private Sub mnueditarcores_Click()
    'Editar a cor activa
    
    cdlImagem.DialogTitle = "Seleccione uma cor:"
    cdlImagem.ShowColor
    cor = cdlImagem.Color
    piccoractiva.BackColor = cor
End Sub

Private Sub mnuferramentas_Click()
    'Põe no modo visivel ou invisivel a barras de ferramentas
    
    If Fraferramentas.Visible = False Then
        Fraferramentas.Visible = True
        mnuferramentas.Checked = True
       
     Else
        Fraferramentas.Visible = False
        mnuferramentas.Checked = False
        mnucordenadas.Checked = False
        lblcordenadas.Visible = False
        lblcoordenadas2.Visible = False
    End If
  
End Sub

Private Sub mnuformatartext_Click()
    'Formatar texto (tipo de letra, tamanho...)
    
    cdlImagem.DialogTitle = "Formatar Texto"
    cdlImagem.Flags = cdlCFScreenFonts
    cdlImagem.ShowFont
    Picture1.Font = cdlImagem.FontName
    Picture1.FontSize = cdlImagem.FontSize
    If cdlImagem.FontBold Then
        Picture1.FontBold = True
    Else
        Picture1.FontBold = False
    End If
    If cdlImagem.FontItalic Then
        Picture1.FontItalic = True
    Else
        Picture1.FontItalic = False
    End If
    If cdlImagem.FontUnderline Then
        Picture1.FontUnderline = True
    End If
    
End Sub

Private Sub mnuguardar_Click()
    'Guardar a imagem
    
    On Error Resume Next
    cdlImagem.DialogTitle = "Guardar Imagem"
    cdlImagem.Filter = "Bitmaps(*.bmp)|*.bmp"
    cdlImagem.Flags = cdlOFNHideReadOnly
    cdlImagem.ShowSave
    SavePicture Picture1.Image, cdlImagem.FileName
End Sub

Private Sub mnuLimpar_Click()
    'Limpa o ecrã
    
    Picture1.Picture = LoadPicture()
    Picture1.Cls
End Sub

Private Sub mnuLinha_Click()
    'Define o menu Linha
    
    MousePointer = 2
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = True
    mnurectangulo.Checked = False
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
    mnuraios.Checked = False
    mnusarrabiscos.Checked = False
    
End Sub

Private Sub mnunovo_Click()
    'Criar 1 novo documento
    '1ºGuardar o documento
    
    Dim resposta As Integer
    resposta = MsgBox("Deseja Guardar o arquivo?", vbYesNo, "Guardar")
    If resposta = vbYes Then
        cdlImagem.DialogTitle = "Guardar Imagem"
        cdlImagem.Filter = "Bitmaps(*.bmp)|*.bmp"
        cdlImagem.Flags = cdlOFNHideReadOnly
        cdlImagem.ShowSave
        SavePicture Picture1.Image, cdlImagem.FileName
    End If
    'Cria novo documento
    Picture1.Picture = LoadPicture()
    Picture1.Cls
    NomeDoArquivo = ""
    Me.Caption = "Desenho"
    
End Sub

Private Sub mnuraios_Click()
    MousePointer = 2
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = False
    mnurectangulo.Checked = False
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
    mnuraios.Checked = True
    mnusarrabiscos.Checked = False
End Sub

Private Sub mnurectangulo_Click()
    'Define o menu Rectangulo
    
    MousePointer = 2
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = False
    mnurectangulo.Checked = True
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
    mnuraios.Checked = False
    mnusarrabiscos.Checked = False
    
End Sub

Private Sub mnusair_Click()
    Unload Me
End Sub

Private Sub mnusarrabiscos_Click()
    MousePointer = 2
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = False
    mnurectangulo.Checked = False
    mnuCirculo.Checked = False
    mnuTexto.Checked = False
    mnuraios.Checked = False
    mnusarrabiscos.Checked = True
End Sub

Private Sub mnuTexto_Click()
    'Define o menu Texto
    
    MousePointer = 3
    mnudesenho.Checked = False
    mnuborracha.Checked = False
    mnulinha.Checked = False
    mnurectangulo.Checked = False
    mnuCirculo.Checked = False
    mnuTexto.Checked = True
    mnuraios.Checked = False
    mnusarrabiscos.Checked = False
End Sub

Private Sub Piccf_Click()
    If mnurectangulo.Checked = True Then
        Piccf.Picture = Picscl.Picture
        Piccl.Picture = Picture4.Picture
        Picsf.Picture = Picture5.Picture
        d = 0
        f = 0
    ElseIf mnuCirculo.Checked Then
        Piccf.Picture = Picscl.Picture
        Piccl.Picture = Picture4.Picture
        Picsf.Picture = Picture5.Picture
        d = 0
        f = 0
    End If
End Sub

Private Sub Piccl_Click()
    If mnurectangulo.Checked Then
        Piccl.Picture = Picscl.Picture
        Piccf.Picture = Picture2.Picture
        Picsf.Picture = Picture5.Picture
        d = 0
        f = 1
    ElseIf mnuCirculo.Checked Then
        Piccl.Picture = Picscl.Picture
        Piccf.Picture = Picture2.Picture
        Picsf.Picture = Picture5.Picture
        d = 0
        f = 1
    End If
End Sub

Private Sub Piccor_DblClick(Index As Integer)
    'Permite definir a cor que queremos(fundo ou activa)
    'Clicando duas vezes na barra de cores
    'Botão direito para a cor de fundo
    'Botão esquerdo para a cor activa
    
    If Button = 1 Then
        cdlImagem.DialogTitle = "Seleccione uma cor:"
        cdlImagem.ShowColor
        cor = cdlImagem.Color
        piccoractiva.BackColor = cor
    ElseIf Button = 2 Then
        cdlImagem.DialogTitle = "Seleccione uma cor:"
        cdlImagem.ShowColor
        corfundo = cdlImagem.Color
        Picture1.BackColor = corfundo
        Picfundo.BackColor = corfundo
    End If
End Sub

Private Sub Piccor_MouseUp(Index As Integer, Button As Integer, Shift As Integer, X As Single, Y As Single)
    If Button = 1 Then
        cor = QBColor(Index)
        piccoractiva.BackColor = cor
    Else
        corfundo = QBColor(Index)
        Picfundo.BackColor = corfundo
    End If
    
End Sub

Private Sub Picsf_Click()
    Piccl.Picture = Picture4.Picture
    Piccf.Picture = Picture2.Picture
    Picsf.Picture = Picture6.Picture
    d = 5 'Tipo de linha
    f = 0 'Preenchimento do rectangulo
End Sub

Private Sub Picture1_MouseDown(Button As Integer, Shift As Integer, X As Single, Y As Single)
    If Button = 1 Then
        
        Xinicial = X
        Yinicial = Y
        Xfinal = Xinicial
        Yfinal = Yinicial
        Picture1.DrawMode = 2
        Picture1.FillStyle = 1
        
  
    
        If mnuraios.Checked = True Then
            If poligono = "Já foi pressionado uma vez" Then
                 Picture1.DrawWidth = 2
                Picture1.DrawStyle = 0
               Picture1.DrawMode = 13
               Picture1.FillStyle = 1
                Picture1.Line (poligonox, poligonoy)-(X, Y), cor
                poligonox = X
                poligonoy = Y
            Else
                 Picture1.DrawWidth = 2
                Picture1.DrawStyle = 0
                
                
                poligono = "Já foi pressionado uma vez"
                poligonox = X
                poligonoy = Y
            End If
        End If
    End If

End Sub

Private Sub Picture1_MouseMove(Button As Integer, Shift As Integer, X As Single, Y As Single)
        'Coordenadas
        If lblcordenadas.left <> Fraferramentas.Width - 1500 Then
        lblcordenadas.left = Fraferramentas.Width - 1500
    End If
    lblcordenadas.Caption = "X : " & X & "y: " & Y
    If Button <> 1 Then Exit Sub
        
    
    
        'Sarrabiscos
        If mnusarrabiscos.Checked = True Then
            z = Val(txtespessura.Text)
            Picture1.DrawWidth = 1
            Picture1.DrawStyle = 0
            Picture1.DrawMode = 13
             For contador = 1 To 500
                a = Rnd * Picture1.ScaleWidth
                b = Rnd * Picture1.ScaleHeight
                Picture1.Line (Xfinal, Yfinal)-(a, b), cor
            Next contador
          End If
          
          'Desenho Livre
          If mnudesenho.Checked = True Then
                z = Val(txtespessura.Text)
                Picture1.DrawWidth = z
                Picture1.DrawStyle = 0
                Picture1.DrawMode = 13
                Picture1.Line (Xfinal, Yfinal)-(X, Y), cor
         End If
         
        'Borracha
        If mnuborracha.Checked = True Then
            Picture1.DrawStyle = 0
            Picture1.DrawWidth = 20
            Picture1.DrawMode = 13
            Picture1.Line (Xfinal, Yfinal)-(X, Y), corfundo
        End If
        
        'Desenhar linhas
        If mnulinha.Checked Then
             z = Val(txtespessura.Text) 'Espessura das linhas
             
             If z <= 0 Then
                Do
                    z = InputBox("Valor inválido ou nulo, introduza novo valor")
                    txtespessura.Text = z
                Loop While (z <= 0)
             End If
            Picture1.DrawStyle = 0
            Picture1.DrawWidth = z
            Picture1.Line (Xinicial, Yinicial)-(Xfinal, Yfinal)
            Picture1.Line (Xinicial, Yinicial)-(X, Y)
        End If
    
        'Desenhar rectangulos
        If mnurectangulo.Checked Then
            z = Val(txtespessura.Text)
            Picture1.DrawWidth = z
            Picture1.DrawStyle = d
            Picture1.Line (Xinicial, Yinicial)-(Xfinal, Yfinal), , B
            Picture1.Line (Xinicial, Yinicial)-(X, Y), , B
        End If
        
        
        
        'Desenhar círculos
        If mnuCirculo.Checked Then
            z = Val(txtespessura.Text)
            Picture1.DrawWidth = z
            Picture1.DrawMode = 6
            Picture1.DrawStyle = d
            Picture1.Circle (Xinicial, Yinicial), Sqr((Xfinal - Xinicial) ^ 2 + (Yfinal - Yinicial) ^ 2)
            Picture1.Circle (Xinicial, Yinicial), Sqr((X - Xinicial) ^ 2 + (Y - Yinicial) ^ 2)
        End If
    
    
    Xfinal = X
    Yfinal = Y
  
End Sub

Private Sub Picture1_MouseUp(Button As Integer, Shift As Integer, X As Single, Y As Single)
    'Põe no modo de desenho, para poder desenhar os objectos
    Picture1.FillStyle = Preencimento
    Picture1.FillColor = corfundo
    Picture1.DrawMode = 13
    
    'Desenha círculo
    
    If mnuCirculo.Checked Then
        Picture1.FillStyle = f
        Picture1.Circle (Xinicial, Yinicial), Sqr((X - Xinicial) ^ 2 + (Y - Yinicial) ^ 2), cor
    End If
    
    
   'Raios
   If mnuraios.Checked = True Then
        Picture1.FillStyle = 1
        Picture1.Line (Xinicial, Yinicial)-(X, Y), cor
        Picture1.Line (Xinicial, Yinicial)-(X, Y), cor
    End If
        
        'Desenha Linha
    
    If mnulinha.Checked Then
        
    
        Picture1.FillStyle = 1
        Picture1.Line (Xinicial, Yinicial)-(X, Y), cor
        Picture1.Line (Xinicial, Yinicial)-(X, Y), cor
    End If
    'Desenha rectângulo
    
    If mnurectangulo.Checked Then
        Picture1.FillStyle = f
        Picture1.Line (Xinicial, Yinicial)-(X, Y), cor, B
    End If
    'Desenha texto
    If mnuTexto.Checked Then
        texto = InputBox("Introduza o Texto", "Texto")
        Picture1.ForeColor = cor
        Picture1.CurrentX = X
        Picture1.CurrentY = Y
        Picture1.Print texto
        Picture1.ForeColor = vbBlack
    End If
    
End Sub
