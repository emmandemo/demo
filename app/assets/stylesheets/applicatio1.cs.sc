/*
 * This is a manifest file that'll be compiled into application.css, which will include all the files
 * listed below.
 *
 * Any CSS and SCSS file within this directory, lib/assets/stylesheets, vendor/assets/stylesheets,
 * or any plugin's vendor/assets/stylesheets directory can be referenced here using a relative path.
 *
 * You're free to add application-wide styles to this file and they'll appear at the bottom of the
 * compiled file so the styles you add here take precedence over styles defined in any styles
 * defined in the other CSS/SCSS files in this directory. It is generally better to create a new
 * file per style scope.
 *
 *= require_tree .
 *= require_self
 */

#banner {
 background: #9c9;
 padding: 10px;
 border-bottom: 2px solid;
 font: small-caps 40px/40px "Times New Roman", serif;
 color: #282;
 text-align: center;

 img {
 float: left;
 height: 50px; 
}
 }

 #notice {
 color: #000 !important;
 border: 2px solid red;
 padding: 1em;
 margin-bottom: 2em;
 background-color: #f0f0f0;
 font: bold smaller sans-serif;
 }

 #columns {
 background: #141;

 #main {
 margin-left: 17em;
 padding: 1em;
 background: white;
 }

 #side {
 float: left;
 padding: 1em 2em;
 width: 13em;
 background: #141;

 form, div {
 display: inline;
 }

 input {
 font-size: small;
 }

 #cart {
 font-size: smaller;
 color: white;

 table {
 border-top: 1px dotted #595;
 border-bottom: 1px dotted #595;
 margin-bottom: 10px;
 }
 }
 ul {
 padding: 0;
 li {
 list-style: none;
 a {
 color: #bfb;
 font-size: small;
 }
 }
 }
 }
 }


.helping_form {
fieldset {
background: #efe;
legend {
color: #dfd;
background: #141;
font-family: sans-serif;
padding: 0.2em 1em;
}
}
form {
label {
width: 5em;
float: left;
text-align: right;
padding-top: 0.2em;
margin-right: 0.1em;
display: block;
}
select, textarea, input {
margin-left: 0.5em;
}
.submit {
margin-left: 4em;
}
br {
display: none
}
}
}
