<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html lang="no">
<head>
    <meta charset="UTF-8">
    <title>Mini-apps</title>
    <style>
        body { font-family: system-ui, sans-serif; max-width: 700px; margin: 2rem auto; }
        .card { border: 1px solid #ddd; border-radius: 12px; padding: 1rem 1.25rem; margin-bottom: 1rem; }
        .row { display: flex; gap: .5rem; align-items: center; }
        input[type="text"] { padding: .5rem; border-radius: 8px; border: 1px solid #ccc; flex: 1; }
        button { padding: .5rem .9rem; border-radius: 8px; border: 1px solid #888; background: #f7f7f7; cursor: pointer; }
        a.button { display: inline-block; padding: .5rem .9rem; border-radius: 8px; border: 1px solid #888; background: #f7f7f7; text-decoration: none; color: inherit; }
    </style>
</head>
<body>
<h1>Welcome 👋</h1>

<!-- Anagram-programmet -->
<div class="card">
    <h2>Anagram</h2>
    <form class="row" action="<%= request.getContextPath() %>/anagram" method="get">
        <input type="text" name="word" placeholder="Type a word">
        <button type="submit">Finn anagrams</button>
    </form>
</div>

<!-- Roman Numeral-programmet -->
<div class="card">
    <h2>Roman Numeral</h2>
    <form class="row" action="<%= request.getContextPath() %>/romanNumeral" method="get">
        <input type="text" name="number" placeholder="Type a number">
        <button type="submit">Convert</button>
    </form>
</div>

</body>
</html>