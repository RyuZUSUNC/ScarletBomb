package View.UtilsView.PortScanView;
import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class PortFast extends Application {

    final String a = "\n" +
            "<!DOCTYPE html><html><head>\n" +
            "      <title>t2</title>\n" +
            "      <meta charset=\"utf-8\">\n" +
            "      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "      \n" +
            "      <style>\n" +
            "      /**\n" +
            "code[class*=\"language-\"],\n" +
            "pre[class*=\"language-\"] {\n" +
            "  color: #333;\n" +
            "  background: none;\n" +
            "  font-family: Consolas, \"Liberation Mono\", Menlo, Courier, monospace;\n" +
            "  text-align: left;\n" +
            "  white-space: pre;\n" +
            "  word-spacing: normal;\n" +
            "  word-break: normal;\n" +
            "  word-wrap: normal;\n" +
            "  line-height: 1.4;\n" +
            "  -moz-tab-size: 8;\n" +
            "  -o-tab-size: 8;\n" +
            "  tab-size: 8;\n" +
            "  -webkit-hyphens: none;\n" +
            "  -moz-hyphens: none;\n" +
            "  -ms-hyphens: none;\n" +
            "  hyphens: none;\n" +
            "}\n" +
            "/* Code blocks */\n" +
            "pre[class*=\"language-\"] {\n" +
            "  padding: .8em;\n" +
            "  overflow: auto;\n" +
            "  /* border: 1px solid #ddd; */\n" +
            "  border-radius: 3px;\n" +
            "  /* background: #fff; */\n" +
            "  background: #f5f5f5;\n" +
            "}\n" +
            ":not(pre) > code[class*=\"language-\"] {\n" +
            "  padding: .1em;\n" +
            "  border-radius: .3em;\n" +
            "  white-space: normal;\n" +
            "  background: #f5f5f5;\n" +
            "}\n" +
            "/* CSS */\n" +
            "code.language-css,\n" +
            ".language-css .token.function {\n" +
            "  color: #0086b3;\n" +
            "}\n" +
            "/* highlight */\n" +
            "pre[data-line] {\n" +
            "  position: relative;\n" +
            "  padding: 1em 0 1em 3em;\n" +
            "}\n" +
            "pre[data-line] .line-highlight-wrapper {\n" +
            "  position: absolute;\n" +
            "  top: 0;\n" +
            "  left: 0;\n" +
            "  background-color: transparent;\n" +
            "  display: block;\n" +
            "  width: 100%;\n" +
            "}\n" +
            "pre[data-line] .line-highlight {\n" +
            "  position: absolute;\n" +
            "  left: 0;\n" +
            "  right: 0;\n" +
            "  padding: inherit 0;\n" +
            "  margin-top: 1em;\n" +
            "  background: hsla(24, 20%, 50%,.08);\n" +
            "  background: linear-gradient(to right, hsla(24, 20%, 50%,.1) 70%, hsla(24, 20%, 50%,0));\n" +
            "  pointer-events: none;\n" +
            "  line-height: inherit;\n" +
            "  white-space: pre;\n" +
            "}\n" +
            "pre[data-line] .line-highlight:before, \n" +
            "pre[data-line] .line-highlight[data-end]:after {\n" +
            "  content: attr(data-start);\n" +
            "  position: absolute;\n" +
            "  top: .4em;\n" +
            "  left: .6em;\n" +
            "  min-width: 1em;\n" +
            "  padding: 0 .5em;\n" +
            "  background-color: hsla(24, 20%, 50%,.4);\n" +
            "  color: hsl(24, 20%, 95%);\n" +
            "  font: bold 65%/1.5 sans-serif;\n" +
            "  text-align: center;\n" +
            "  vertical-align: .3em;\n" +
            "  border-radius: 999px;\n" +
            "  text-shadow: none;\n" +
            "  box-shadow: 0 1px white;\n" +
            "}\n" +
            "\n" +
            "pre[data-line] .line-highlight[data-end]:after {\n" +
            "  content: attr(data-end);\n" +
            "  top: auto;\n" +
            "  bottom: .4em;\n" +
            "}html body{font-family:\"Helvetica Neue\",Helvetica,\"Segoe UI\",Arial,freesans,sans-serif;font-size:16px;line-height:1.6;color:#333;background-color:#fff;overflow:initial;box-sizing:border-box;word-wrap:break-word}html body>:first-child{margin-top:0}html body h1,html body h2,html body h3,html body h4,html body h5,html body h6{line-height:1.2;margin-top:1em;margin-bottom:16px;color:#000}html body h1{font-size:2.25em;font-weight:300;padding-bottom:.3em}html body h2{font-size:1.75em;font-weight:400;padding-bottom:.3em}html body h3{font-size:1.5em;font-weight:500}html body h4{font-size:1.25em;font-weight:600}html body h5{font-size:1.1em;font-weight:600}html body h6{font-size:1em;font-weight:600}html body h1,html body h2,html body h3,html body h4,html body h5{font-weight:600}html body h5{font-size:1em}html body h6{color:#5c5c5c}html body strong{color:#000}html body del{color:#5c5c5c}html body a:not([href]){color:inherit;text-decoration:none}html body a{color:#08c;text-decoration:none}html body a:hover{color:#00a3f5;text-decoration:none}html body img{max-width:100%}html body>p{margin-top:0;margin-bottom:16px;word-wrap:break-word}html body>ul,html body>ol{margin-bottom:16px}html body ul,html body ol{padding-left:2em}html body ul.no-list,html body ol.no-list{padding:0;list-style-type:none}html body ul ul,html body ul ol,html body ol ol,html body ol ul{margin-top:0;margin-bottom:0}html body li{margin-bottom:0}html body li.task-list-item{list-style:none}html body li>p{margin-top:0;margin-bottom:0}html body .task-list-item-checkbox{margin:0 .2em .25em -1.8em;vertical-align:middle}html body .task-list-item-checkbox:hover{cursor:pointer}html body blockquote{margin:16px 0;font-size:inherit;padding:0 15px;color:#5c5c5c;background-color:#f0f0f0;border-left:4px solid #d6d6d6}html body blockquote>:first-child{margin-top:0}html body blockquote>:last-child{margin-bottom:0}html body hr{height:4px;margin:32px 0;background-color:#d6d6d6;border:0 none}html body table{margin:10px 0 15px 0;border-collapse:collapse;border-spacing:0;display:block;width:100%;overflow:auto;word-break:normal;word-break:keep-all}html body table th{font-weight:bold;color:#000}html body table td,html body table th{border:1px solid #d6d6d6;padding:6px 13px}html body dl{padding:0}html body dl dt{padding:0;margin-top:16px;font-size:1em;font-style:italic;font-weight:bold}html body dl dd{padding:0 16px;margin-bottom:16px}html body code{font-family:Menlo,Monaco,Consolas,'Courier New',monospace;font-size:.85em !important;color:#000;background-color:#f0f0f0;border-radius:3px;padding:.2em 0}html body code::before,html body code::after{letter-spacing:-0.2em;content:\"\\00a0\"}html body pre>code{padding:0;margin:0;font-size:.85em !important;word-break:normal;white-space:pre;background:transparent;border:0}html body .highlight{margin-bottom:16px}html body .highlight pre,html body pre{padding:1em;overflow:auto;font-size:.85em !important;line-height:1.45;border:#d6d6d6;border-radius:3px}html body .highlight pre{margin-bottom:0;word-break:normal}html body pre code,html body pre tt{display:inline;max-width:initial;padding:0;margin:0;overflow:initial;line-height:inherit;word-wrap:normal;background-color:transparent;border:0}html body pre code:before,html body pre tt:before,html body pre code:after,html body pre tt:after{content:normal}html body p,html body blockquote,html body ul,html body ol,html body dl,html body pre{margin-top:0;margin-bottom:16px}html body kbd{color:#000;border:1px solid #d6d6d6;border-bottom:2px solid #c7c7c7;padding:2px 4px;background-color:#f0f0f0;border-radius:3px}@media print{html body{background-color:#fff}html body h1,html body h2,html body h3,html body h4,html body h5,html body h6{color:#000;page-break-after:avoid}html body blockquote{color:#5c5c5c}html body pre{page-break-inside:avoid}html body table{display:table}html body img{display:block;max-width:100%;max-height:100%}html body pre,html body code{word-wrap:break-word;white-space:pre}}.markdown-preview{width:100%;height:100%;box-sizing:border-box}.markdown-preview .pagebreak,.markdown-preview .newpage{page-break-before:always}.markdown-preview pre.line-numbers{position:relative;padding-left:3.8em;counter-reset:linenumber}.markdown-preview pre.line-numbers>code{position:relative}.markdown-preview pre.line-numbers .line-numbers-rows{position:absolute;pointer-events:none;top:1em;font-size:100%;left:0;width:3em;letter-spacing:-1px;border-right:1px solid #999;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}.markdown-preview pre.line-numbers .line-numbers-rows>span{pointer-events:none;display:block;counter-increment:linenumber}.markdown-preview pre.line-numbers .line-numbers-rows>span:before{content:counter(linenumber);color:#999;display:block;padding-right:.8em;text-align:right}.markdown-preview .mathjax-exps .MathJax_Display{text-align:center !important}.markdown-preview:not([for=\"preview\"]) .code-chunk .btn-group{display:none}.markdown-preview:not([for=\"preview\"]) .code-chunk .status{display:none}.markdown-preview:not([for=\"preview\"]) .code-chunk .output-div{margin-bottom:16px}.scrollbar-style::-webkit-scrollbar{width:8px}.scrollbar-style::-webkit-scrollbar-track{border-radius:10px;background-color:transparent}.scrollbar-style::-webkit-scrollbar-thumb{border-radius:5px;background-color:rgba(150,150,150,0.66);border:4px solid rgba(150,150,150,0.66);background-clip:content-box}html body[for=\"html-export\"]:not([data-presentation-mode]){position:relative;width:100%;height:100%;top:0;left:0;margin:0;padding:0;overflow:auto}html body[for=\"html-export\"]:not([data-presentation-mode]) .markdown-preview{position:relative;top:0}@media screen and (min-width:914px){html body[for=\"html-export\"]:not([data-presentation-mode]) .markdown-preview{padding:2em calc(50% - 457px + 2em)}}@media screen and (max-width:914px){html body[for=\"html-export\"]:not([data-presentation-mode]) .markdown-preview{padding:2em}}@media screen and (max-width:450px){html body[for=\"html-export\"]:not([data-presentation-mode]) .markdown-preview{font-size:14px !important;padding:1em}}@media print{html body[for=\"html-export\"]:not([data-presentation-mode]) #sidebar-toc-btn{display:none}}html body[for=\"html-export\"]:not([data-presentation-mode]) #sidebar-toc-btn{position:fixed;bottom:8px;left:8px;font-size:28px;cursor:pointer;color:inherit;z-index:99;width:32px;text-align:center;opacity:.4}html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] #sidebar-toc-btn{opacity:1}html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] .md-sidebar-toc{position:fixed;top:0;left:0;width:300px;height:100%;padding:32px 0 48px 0;font-size:14px;box-shadow:0 0 4px rgba(150,150,150,0.33);box-sizing:border-box;overflow:auto;background-color:inherit}html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] .md-sidebar-toc::-webkit-scrollbar{width:8px}html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] .md-sidebar-toc::-webkit-scrollbar-track{border-radius:10px;background-color:transparent}html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] .md-sidebar-toc::-webkit-scrollbar-thumb{border-radius:5px;background-color:rgba(150,150,150,0.66);border:4px solid rgba(150,150,150,0.66);background-clip:content-box}html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] .md-sidebar-toc a{text-decoration:none}html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] .md-sidebar-toc ul{padding:0 1.6em;margin-top:.8em}html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] .md-sidebar-toc li{margin-bottom:.8em}html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] .md-sidebar-toc ul{list-style-type:none}html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] .markdown-preview{left:300px;width:calc(100% -  300px);padding:2em calc(50% - 457px -  150px);margin:0;box-sizing:border-box}@media screen and (max-width:1274px){html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] .markdown-preview{padding:2em}}@media screen and (max-width:450px){html body[for=\"html-export\"]:not([data-presentation-mode])[html-show-sidebar-toc] .markdown-preview{width:100%}}html body[for=\"html-export\"]:not([data-presentation-mode]):not([html-show-sidebar-toc]) .markdown-preview{left:50%;transform:translateX(-50%)}html body[for=\"html-export\"]:not([data-presentation-mode]):not([html-show-sidebar-toc]) .md-sidebar-toc{display:none}\n" +
            "\n" +
            "      </style>\n" +
            "    </head>\n" +
            "    <body for=\"html-export\">\n" +
            "      <div class=\"mume markdown-preview  \">\n" +
            "      <table>\n" +
            "<thead>\n" +
            "<tr>\n" +
            "<th>&#x7AEF;&#x53E3;</th>\n" +
            "<th>&#x670D;&#x52A1;</th>\n" +
            "<th>&#x5165;&#x4FB5;&#x65B9;&#x5F0F;</th>\n" +
            "</tr>\n" +
            "</thead>\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<td>21</td>\n" +
            "<td>ftp/tftp/vsftpd&#x6587;&#x4EF6;&#x4F20;&#x8F93;&#x534F;&#x8BAE;</td>\n" +
            "<td>&#x7206;&#x7834;/&#x55C5;&#x63A2;/&#x6EA2;&#x51FA;/&#x540E;&#x95E8;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>22</td>\n" +
            "<td>ssh&#x8FDC;&#x7A0B;&#x8FDE;&#x63A5;</td>\n" +
            "<td>&#x7206;&#x7834;/openssh&#x6F0F;&#x6D1E;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>23</td>\n" +
            "<td>Telnet&#x8FDC;&#x7A0B;&#x8FDE;&#x63A5;</td>\n" +
            "<td>&#x7206;&#x7834;/&#x55C5;&#x63A2;/&#x5F31;&#x53E3;&#x4EE4;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>25</td>\n" +
            "<td>SMTP&#x90AE;&#x4EF6;&#x670D;&#x52A1;</td>\n" +
            "<td>&#x90AE;&#x4EF6;&#x4F2A;&#x9020;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>53</td>\n" +
            "<td>DNS&#x57DF;&#x540D;&#x89E3;&#x6790;&#x7CFB;&#x7EDF;</td>\n" +
            "<td>&#x57DF;&#x4F20;&#x9001;/&#x52AB;&#x6301;/&#x7F13;&#x5B58;&#x6295;&#x6BD2;/&#x6B3A;&#x9A97;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>67/68</td>\n" +
            "<td>dhcp&#x670D;&#x52A1;</td>\n" +
            "<td>&#x52AB;&#x6301;/&#x6B3A;&#x9A97;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>110</td>\n" +
            "<td>pop3</td>\n" +
            "<td>&#x7206;&#x7834;/&#x55C5;&#x63A2;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>139</td>\n" +
            "<td>Samba&#x670D;&#x52A1;</td>\n" +
            "<td>&#x7206;&#x7834;/&#x672A;&#x6388;&#x6743;&#x8BBF;&#x95EE;/&#x8FDC;&#x7A0B;&#x547D;&#x4EE4;&#x6267;&#x884C;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>143</td>\n" +
            "<td>Imap&#x534F;&#x8BAE;</td>\n" +
            "<td>&#x7206;&#x7834;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>161</td>\n" +
            "<td>SNMP&#x534F;&#x8BAE;</td>\n" +
            "<td>&#x7206;&#x7834;/&#x641C;&#x96C6;&#x76EE;&#x6807;&#x5185;&#x7F51;&#x4FE1;&#x606F;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>389</td>\n" +
            "<td>Ldap&#x76EE;&#x5F55;&#x8BBF;&#x95EE;&#x534F;&#x8BAE;</td>\n" +
            "<td>&#x6CE8;&#x5165;/&#x672A;&#x6388;&#x6743;&#x8BBF;&#x95EE;/&#x5F31;&#x53E3;&#x4EE4;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>445</td>\n" +
            "<td>smb</td>\n" +
            "<td>ms17-010/&#x7AEF;&#x53E3;&#x6EA2;&#x51FA;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>512/513/514</td>\n" +
            "<td>Linux Rexec&#x670D;&#x52A1;</td>\n" +
            "<td>&#x7206;&#x7834;/Rlogin&#x767B;&#x9646;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>873</td>\n" +
            "<td>Rsync&#x670D;&#x52A1;</td>\n" +
            "<td>&#x6587;&#x4EF6;&#x4E0A;&#x4F20;/&#x672A;&#x6388;&#x6743;&#x8BBF;&#x95EE;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>1080</td>\n" +
            "<td>socket</td>\n" +
            "<td>&#x7206;&#x7834;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>1352</td>\n" +
            "<td>Lotus domino&#x90AE;&#x4EF6;&#x670D;&#x52A1;</td>\n" +
            "<td>&#x7206;&#x7834;/&#x4FE1;&#x606F;&#x6CC4;&#x6F0F;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>1433</td>\n" +
            "<td>mssql</td>\n" +
            "<td>&#x7206;&#x7834;/&#x6CE8;&#x5165;/SA&#x5F31;&#x53E3;&#x4EE4;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>1521</td>\n" +
            "<td>oracle</td>\n" +
            "<td>&#x7206;&#x7834;/&#x6CE8;&#x5165;/TNS&#x7206;&#x7834;/&#x53CD;&#x5F39;shell</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>2049</td>\n" +
            "<td>Nfs&#x670D;&#x52A1;</td>\n" +
            "<td>&#x914D;&#x7F6E;&#x4E0D;&#x5F53;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>2181</td>\n" +
            "<td>zookeeper&#x670D;&#x52A1;</td>\n" +
            "<td>&#x672A;&#x6388;&#x6743;&#x8BBF;&#x95EE;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>2375</td>\n" +
            "<td>docker remote api</td>\n" +
            "<td>&#x672A;&#x6388;&#x6743;&#x8BBF;&#x95EE;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>3306</td>\n" +
            "<td>mysql</td>\n" +
            "<td>&#x7206;&#x7834;/&#x6CE8;&#x5165;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>3389</td>\n" +
            "<td>Rdp&#x8FDC;&#x7A0B;&#x684C;&#x9762;&#x94FE;&#x63A5;</td>\n" +
            "<td>&#x7206;&#x7834;/shift&#x540E;&#x95E8;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>4848</td>\n" +
            "<td>GlassFish&#x63A7;&#x5236;&#x53F0;</td>\n" +
            "<td>&#x7206;&#x7834;/&#x8BA4;&#x8BC1;&#x7ED5;&#x8FC7;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>5000</td>\n" +
            "<td>sybase/DB2&#x6570;&#x636E;&#x5E93;</td>\n" +
            "<td>&#x7206;&#x7834;/&#x6CE8;&#x5165;/&#x63D0;&#x6743;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>5432</td>\n" +
            "<td>postgresql</td>\n" +
            "<td>&#x7206;&#x7834;/&#x6CE8;&#x5165;/&#x7F13;&#x51B2;&#x533A;&#x6EA2;&#x51FA;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>5632</td>\n" +
            "<td>pcanywhere&#x670D;&#x52A1;</td>\n" +
            "<td>&#x6293;&#x5BC6;&#x7801;/&#x4EE3;&#x7801;&#x6267;&#x884C;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>5900</td>\n" +
            "<td>vnc</td>\n" +
            "<td>&#x7206;&#x7834;/&#x8BA4;&#x8BC1;&#x7ED5;&#x8FC7;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>6379</td>\n" +
            "<td>Redis&#x6570;&#x636E;&#x5E93;</td>\n" +
            "<td>&#x672A;&#x6388;&#x6743;&#x8BBF;&#x95EE;/&#x7206;&#x7834;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>7001/7002</td>\n" +
            "<td>weblogic</td>\n" +
            "<td>java&#x53CD;&#x5E8F;&#x5217;&#x5316;/&#x63A7;&#x5236;&#x53F0;&#x5F31;&#x53E3;&#x4EE4;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>80/443</td>\n" +
            "<td>http/https</td>\n" +
            "<td>web&#x5E94;&#x7528;&#x6F0F;&#x6D1E;/&#x5FC3;&#x810F;&#x6EF4;&#x8840;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>8069</td>\n" +
            "<td>zabbix&#x670D;&#x52A1;</td>\n" +
            "<td>&#x8FDC;&#x7A0B;&#x547D;&#x4EE4;&#x6267;&#x884C;/&#x6CE8;&#x5165;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>8161</td>\n" +
            "<td>activemq</td>\n" +
            "<td>&#x5F31;&#x53E3;&#x4EE4;/&#x5199;&#x6587;&#x4EF6;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>8080/8089</td>\n" +
            "<td>Jboss/Tomcat/Resin</td>\n" +
            "<td>&#x7834;/PUT&#x6587;&#x4EF6;&#x4E0A;&#x4F20;/&#x53CD;&#x5E8F;&#x5217;&#x5316;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>8083/8086</td>\n" +
            "<td>influxDB</td>\n" +
            "<td>&#x672A;&#x6388;&#x6743;&#x8BBF;&#x95EE;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>9000</td>\n" +
            "<td>fastcgi</td>\n" +
            "<td>&#x8FDC;&#x7A0B;&#x547D;&#x4EE4;&#x6267;&#x884C;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>9090</td>\n" +
            "<td>Websphere&#x63A7;&#x5236;&#x53F0;</td>\n" +
            "<td>&#x7206;&#x7834;/java&#x53CD;&#x5E8F;&#x5217;&#x5316;/&#x5F31;&#x53E3;&#x4EE4;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>9200/9300</td>\n" +
            "<td>elasticsearch</td>\n" +
            "<td>&#x8FDC;&#x7A0B;&#x4EE3;&#x7801;&#x6267;&#x884C;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>11211</td>\n" +
            "<td>memcached</td>\n" +
            "<td>&#x672A;&#x6388;&#x6743;&#x8BBF;&#x95EE;</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>27017/27018</td>\n" +
            "<td>mongodb</td>\n" +
            "<td>&#x672A;&#x6388;&#x6743;&#x8BBF;&#x95EE;/&#x7206;&#x7834;</td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "\n" +
            "      </div>\n" +
            "    </body></html>";

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("PortFast");
        primaryStage.setWidth(670);
        primaryStage.setHeight(800);
        primaryStage.getIcons().add(new Image(PortFast.class.getResourceAsStream("/img/icon/book-2-line.png")));
        VBox root = new VBox();
        Scene scene = new Scene(new Group());
        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        browser.setPrefHeight(800);
        webEngine.loadContent(a);

        root.getChildren().addAll(browser);
        scene.setRoot(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
