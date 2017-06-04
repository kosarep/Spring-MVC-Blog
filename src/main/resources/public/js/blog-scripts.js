/**
 * Created by Grzegorz on 31.05.2017.
 */

$(function() {
   $('#messages li').click(function () {
       $(this).fadeOut();
   });
   setTimeout(function () {
      $('messages li.info').fadeOut();
   }, 3000);
});
