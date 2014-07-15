<!DOCTYPE html>
<html>
<head>
    <title>Grails Spring Social Google Plugin - <g:layoutTitle default="Grails"/></title>
    <link rel="stylesheet" href="${resource(dir: 'css/springsocial', file: 'page.css', plugin: 'spring-social-core')}"/>
    <link rel="stylesheet" href="${resource(dir: 'css/springsocial', file: 'form.css', plugin: 'spring-social-core')}"/>
    <link rel="stylesheet" href="${resource(dir: 'css/springsocial', file: 'twitter.css', plugin: 'spring-social-twitter')}"/>
    <g:layoutHead/>
</head>

<body>
<div id="header">
    <h1>Grails Spring Social Google Plugin !</h1>
</div>

  <div id="left">
    <div id="leftNav">
        <g:render template="/springsocial/google/googleMenu"/>
    </div>
  </div>

  <div id="right">
  <div id="content">
      <g:layoutBody/>
  </div>
  </div>

</body>
</html>

